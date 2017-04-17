/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq;


import diamond.cms.server.model.jooq.tables.CArticle;
import diamond.cms.server.model.jooq.tables.CArticleTag;
import diamond.cms.server.model.jooq.tables.CCatalog;
import diamond.cms.server.model.jooq.tables.CComment;
import diamond.cms.server.model.jooq.tables.CEmailConfig;
import diamond.cms.server.model.jooq.tables.CEmailSend;
import diamond.cms.server.model.jooq.tables.CGuest;
import diamond.cms.server.model.jooq.tables.CIpLocation;
import diamond.cms.server.model.jooq.tables.CKeyword;
import diamond.cms.server.model.jooq.tables.CPageView;
import diamond.cms.server.model.jooq.tables.CSetting;
import diamond.cms.server.model.jooq.tables.CTag;
import diamond.cms.server.model.jooq.tables.CUser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Cms extends SchemaImpl {

    private static final long serialVersionUID = 1731480657;

    /**
     * The reference instance of <code>cms</code>
     */
    public static final Cms CMS = new Cms();

    /**
     * The table <code>cms.c_article</code>.
     */
    public final CArticle C_ARTICLE = diamond.cms.server.model.jooq.tables.CArticle.C_ARTICLE;

    /**
     * The table <code>cms.c_article_tag</code>.
     */
    public final CArticleTag C_ARTICLE_TAG = diamond.cms.server.model.jooq.tables.CArticleTag.C_ARTICLE_TAG;

    /**
     * The table <code>cms.c_catalog</code>.
     */
    public final CCatalog C_CATALOG = diamond.cms.server.model.jooq.tables.CCatalog.C_CATALOG;

    /**
     * The table <code>cms.c_comment</code>.
     */
    public final CComment C_COMMENT = diamond.cms.server.model.jooq.tables.CComment.C_COMMENT;

    /**
     * The table <code>cms.c_email_config</code>.
     */
    public final CEmailConfig C_EMAIL_CONFIG = diamond.cms.server.model.jooq.tables.CEmailConfig.C_EMAIL_CONFIG;

    /**
     * The table <code>cms.c_email_send</code>.
     */
    public final CEmailSend C_EMAIL_SEND = diamond.cms.server.model.jooq.tables.CEmailSend.C_EMAIL_SEND;

    /**
     * The table <code>cms.c_guest</code>.
     */
    public final CGuest C_GUEST = diamond.cms.server.model.jooq.tables.CGuest.C_GUEST;

    /**
     * The table <code>cms.c_ip_location</code>.
     */
    public final CIpLocation C_IP_LOCATION = diamond.cms.server.model.jooq.tables.CIpLocation.C_IP_LOCATION;

    /**
     * The table <code>cms.c_keyword</code>.
     */
    public final CKeyword C_KEYWORD = diamond.cms.server.model.jooq.tables.CKeyword.C_KEYWORD;

    /**
     * The table <code>cms.c_page_view</code>.
     */
    public final CPageView C_PAGE_VIEW = diamond.cms.server.model.jooq.tables.CPageView.C_PAGE_VIEW;

    /**
     * The table <code>cms.c_setting</code>.
     */
    public final CSetting C_SETTING = diamond.cms.server.model.jooq.tables.CSetting.C_SETTING;

    /**
     * The table <code>cms.c_tag</code>.
     */
    public final CTag C_TAG = diamond.cms.server.model.jooq.tables.CTag.C_TAG;

    /**
     * The table <code>cms.c_user</code>.
     */
    public final CUser C_USER = diamond.cms.server.model.jooq.tables.CUser.C_USER;

    /**
     * No further instances allowed
     */
    private Cms() {
        super("cms", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            CArticle.C_ARTICLE,
            CArticleTag.C_ARTICLE_TAG,
            CCatalog.C_CATALOG,
            CComment.C_COMMENT,
            CEmailConfig.C_EMAIL_CONFIG,
            CEmailSend.C_EMAIL_SEND,
            CGuest.C_GUEST,
            CIpLocation.C_IP_LOCATION,
            CKeyword.C_KEYWORD,
            CPageView.C_PAGE_VIEW,
            CSetting.C_SETTING,
            CTag.C_TAG,
            CUser.C_USER);
    }
}
