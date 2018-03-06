/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dto.PartyGroup;
import com.mycompany.biller.dto.Party;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import com.mycompany.biller.dao.PartyGroupDAO;

/**
 *
 * @author ismail
 */
@Repository
public class PartyGroupDAOImpl implements PartyGroupDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPartyGroup(PartyGroup partyGroup) {
//        Session session = sessionFactory.getCurrentSession();
//        session.persist(partyGroup);
        
         sessionFactory.getCurrentSession().save(partyGroup);
    }

    @Override
    public void updatePartyGroup(PartyGroup partyGroup) {
        Session session = sessionFactory.getCurrentSession();
        session.update(partyGroup);
    }

    @Override
    public void deletePartyGroup(int partyGroupId) {
        Session session = sessionFactory.getCurrentSession();
        PartyGroup partyGroup = (PartyGroup) session.load(PartyGroup.class, new Integer(partyGroupId));
        if (partyGroup != null) {
            session.delete(partyGroup);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<PartyGroup> listAllPartyGroup() {
        Session session = sessionFactory.getCurrentSession();
        List<PartyGroup> partyGroups = session.createQuery("from PartyGroup").list();
        return partyGroups;
    }

    @Override
    public List<PartyGroup> findPartyGroupById(int partyGroupId) {
        String selectQuery = "FROM PartyGroup WHERE PARTY_GROUP_ID = :partyGroupId";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("partyGroupId", partyGroupId)
                .list();
    }

    @Override
    public PartyGroup createPartyGroup(PartyGroup partyGroup) {
        int id = (int) sessionFactory.getCurrentSession().save(partyGroup);

//        partyGroup.setPartyGroupId(id);

        return partyGroup;
    }

}
