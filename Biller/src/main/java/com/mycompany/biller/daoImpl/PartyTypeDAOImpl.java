/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dao.PartyTypeDAO;
import com.mycompany.biller.dto.Party;
import com.mycompany.biller.dto.PartyType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ismail
 */

@Repository
public class PartyTypeDAOImpl implements PartyTypeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPartyType(PartyType partyType) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(partyType);
    }

    @Override
    public void updatePartyType(PartyType partyType) {
        Session session = sessionFactory.getCurrentSession();
        session.update(partyType);
    }

    @Override
    public void deletePartyType(int partyTypeId) {
        Session session = sessionFactory.getCurrentSession();
        PartyType partyType = (PartyType) session.load(PartyType.class, new Integer(partyTypeId));
        if (partyType != null) {
            session.delete(partyType);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<PartyType> listAllPartyType() {
        Session session = sessionFactory.getCurrentSession();
        List<PartyType> partyTypeList = session.createQuery("from PartyType").list();
        return partyTypeList;
    }

    @Override
    public List<PartyType> findById(int partyTypeId) {
        String selectQuery = "FROM PartyType WHERE PARTY_TYPE_ID = :partyTypeId";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("partyTypeId", partyTypeId)
                .list();
    }

}
