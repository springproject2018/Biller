/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dao.PartyDAO;
import com.mycompany.biller.dto.Menus;
import com.mycompany.biller.dto.Party;
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
    public void deleteParty(int partyId) {
        Session session = sessionFactory.getCurrentSession();
        Party party = (Party) session.load(Party.class, partyId);
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
    public List<Party> findById(int partyId) {
        String selectQuery = "FROM Party WHERE PARTY_ID = :partyId";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("partyId", partyId)
                .list();
//        (Party) sessionFactory.getCurrentSession().get(Party.class, partyId);
    }

    @Override
    public Party createParty(Party party) {
        int id = (int) sessionFactory.getCurrentSession().save(party);
        
        //sessionFactory.getCurrentSession().flush();
        
        party.setPartyId(id);
        return party;
    }

}
