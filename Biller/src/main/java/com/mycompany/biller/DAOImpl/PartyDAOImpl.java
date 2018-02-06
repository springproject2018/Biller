/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAOImpl;

import com.mycompany.biller.DAO.PartyDAO;
import com.mycompany.biller.model.Menus;
import com.mycompany.biller.model.Party;
import java.util.List;
import static jdk.nashorn.internal.runtime.Debug.id;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ismail
 */
@Repository
public class PartyDAOImpl implements PartyDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addParty(Party party) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(party);
    }

    @Override
    public void updateParty(Party party) {
        Session session = sessionFactory.getCurrentSession();
        session.update(party);
    }

    @Override
    public void deleteParty(String partyId) {
        Session session = sessionFactory.getCurrentSession();
        Party party = (Party) session.load(Party.class, new String(partyId));
        if (party != null) {
            session.delete(party);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Party> listAllParty() {
        Session session = sessionFactory.getCurrentSession();
        List<Party> partyList = session.createQuery("from Party").list();
        return partyList;
    }

    @Override
    public List<Party> findById(String partyId) {
        String selectQuery = "FROM PARTY WHERE PARTY_ID = :partyId";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("partyId", partyId)
                .list();
    }

}
