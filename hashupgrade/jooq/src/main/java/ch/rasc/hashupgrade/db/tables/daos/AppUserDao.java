/*
 * This file is generated by jOOQ.
 */
package ch.rasc.hashupgrade.db.tables.daos;


import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import ch.rasc.hashupgrade.db.tables.AppUser;
import ch.rasc.hashupgrade.db.tables.records.AppUserRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppUserDao extends DAOImpl<AppUserRecord, ch.rasc.hashupgrade.db.tables.pojos.AppUser, Long> {

    /**
     * Create a new AppUserDao without any configuration
     */
    public AppUserDao() {
        super(AppUser.APP_USER, ch.rasc.hashupgrade.db.tables.pojos.AppUser.class);
    }

    /**
     * Create a new AppUserDao with an attached configuration
     */
    public AppUserDao(Configuration configuration) {
        super(AppUser.APP_USER, ch.rasc.hashupgrade.db.tables.pojos.AppUser.class, configuration);
    }

    @Override
    public Long getId(ch.rasc.hashupgrade.db.tables.pojos.AppUser object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ch.rasc.hashupgrade.db.tables.pojos.AppUser> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(AppUser.APP_USER.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<ch.rasc.hashupgrade.db.tables.pojos.AppUser> fetchById(Long... values) {
        return fetch(AppUser.APP_USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public ch.rasc.hashupgrade.db.tables.pojos.AppUser fetchOneById(Long value) {
        return fetchOne(AppUser.APP_USER.ID, value);
    }

    /**
     * Fetch records that have <code>USER_NAME BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ch.rasc.hashupgrade.db.tables.pojos.AppUser> fetchRangeOfUserName(String lowerInclusive, String upperInclusive) {
        return fetchRange(AppUser.APP_USER.USER_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>USER_NAME IN (values)</code>
     */
    public List<ch.rasc.hashupgrade.db.tables.pojos.AppUser> fetchByUserName(String... values) {
        return fetch(AppUser.APP_USER.USER_NAME, values);
    }

    /**
     * Fetch a unique record that has <code>USER_NAME = value</code>
     */
    public ch.rasc.hashupgrade.db.tables.pojos.AppUser fetchOneByUserName(String value) {
        return fetchOne(AppUser.APP_USER.USER_NAME, value);
    }

    /**
     * Fetch records that have <code>EMAIL BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ch.rasc.hashupgrade.db.tables.pojos.AppUser> fetchRangeOfEmail(String lowerInclusive, String upperInclusive) {
        return fetchRange(AppUser.APP_USER.EMAIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>EMAIL IN (values)</code>
     */
    public List<ch.rasc.hashupgrade.db.tables.pojos.AppUser> fetchByEmail(String... values) {
        return fetch(AppUser.APP_USER.EMAIL, values);
    }

    /**
     * Fetch a unique record that has <code>EMAIL = value</code>
     */
    public ch.rasc.hashupgrade.db.tables.pojos.AppUser fetchOneByEmail(String value) {
        return fetchOne(AppUser.APP_USER.EMAIL, value);
    }

    /**
     * Fetch records that have <code>PASSWORD_HASH BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ch.rasc.hashupgrade.db.tables.pojos.AppUser> fetchRangeOfPasswordHash(String lowerInclusive, String upperInclusive) {
        return fetchRange(AppUser.APP_USER.PASSWORD_HASH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>PASSWORD_HASH IN (values)</code>
     */
    public List<ch.rasc.hashupgrade.db.tables.pojos.AppUser> fetchByPasswordHash(String... values) {
        return fetch(AppUser.APP_USER.PASSWORD_HASH, values);
    }
}
