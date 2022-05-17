package com.github.ipecter.rtu.langLib;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum EnumLang {

    AF_ZA("af_za"),
    AR_SA("ar_sa"),
    AST_ES("ast_es"),
    AZ_AZ("az_az"),
    BAR("bar"),
    BA_RU("ba_ru"),
    BE_BY("be_by"),
    BG_BG("bg_bg"),
    BRB("brb"),
    BR_FR("br_fr"),
    BS_BA("bs_ba"),
    CA_ES("ca_es"),
    CS_CZ("cs_cz"),
    CY_GB("cy_gb"),
    DA_DK("da_dk"),
    DE_AT("de_at"),
    DE_CH("de_ch"),
    DE_DE("de_de"),
    EL_GR("el_gr"),
    ENP("enp"),
    ENWS("enws"),
    EN_AU("en_au"),
    EN_CA("en_ca"),
    EN_GB("en_gb"),
    EN_NZ("en_nz"),
    EN_PT("en_pt"),
    EN_UD("en_ud"),
    EN_US("en_us"),
    EO_UY("eo_uy"),
    ESAN("esan"),
    ES_AR("es_ar"),
    ES_CL("es_cl"),
    ES_EC("es_ec"),
    ES_ES("es_es"),
    ES_MX("es_mx"),
    ES_UY("es_uy"),
    ES_VE("es_ve"),
    ET_EE("et_ee"),
    EU_ES("eu_es"),
    FA_IR("fa_ir"),
    FIL_PH("fil_ph"),
    FI_FI("fi_fi"),
    FO_FO("fo_fo"),
    FRA_DE("fra_de"),
    FR_CA("fr_ca"),
    FR_FR("fr_fr"),
    FUR_IT("fur_it"),
    FY_NL("fy_nl"),
    GA_IE("ga_ie"),
    GD_GB("gd_gb"),
    GL_ES("gl_es"),
    HAW_US("haw_us"),
    HE_IL("he_il"),
    HI_IN("hi_in"),
    HR_HR("hr_hr"),
    HU_HU("hu_hu"),
    HY_AM("hy_am"),
    ID_ID("id_id"),
    IG_NG("ig_ng"),
    IO_EN("io_en"),
    ISV("isv"),
    IS_IS("is_is"),
    IT_IT("it_it"),
    JA_JP("ja_jp"),
    JBO_EN("jbo_en"),
    KA_GE("ka_ge"),
    KK_KZ("kk_kz"),
    KN_IN("kn_in"),
    KO_KR("ko_kr"),
    KSH("ksh"),
    KW_GB("kw_gb"),
    LA_LA("la_la"),
    LB_LU("lb_lu"),
    LI_LI("li_li"),
    LMO("lmo"),
    LOL_US("lol_us"),
    LT_LT("lt_lt"),
    LV_LV("lv_lv"),
    LZH("lzh"),
    MK_MK("mk_mk"),
    MN_MN("mn_mn"),
    MS_MY("ms_my"),
    MT_MT("mt_mt"),
    NDS_DE("nds_de"),
    NL_BE("nl_be"),
    NL_NL("nl_nl"),
    NN_NO("nn_no"),
    NO_NO("no_no"),
    OC_FR("oc_fr"),
    OVD("ovd"),
    PL_PL("pl_pl"),
    PT_BR("pt_br"),
    PT_PT("pt_pt"),
    QYA_AA("qya_aa"),
    RO_RO("ro_ro"),
    RPR("rpr"),
    RU_RU("ru_ru"),
    SE_NO("se_no"),
    SK_SK("sk_sk"),
    SL_SI("sl_si"),
    SO_SO("so_so"),
    SQ_AL("sq_al"),
    SR_SP("sr_sp"),
    SV_SE("sv_se"),
    SXU("sxu"),
    SZL("szl"),
    TA_IN("ta_in"),
    TH_TH("th_th"),
    TLH_AA("tlh_aa"),
    TL_PH("tl_ph"),
    TOK("tok"),
    TR_TR("tr_tr"),
    TT_RU("tt_ru"),
    UK_UA("uk_ua"),
    VAL_ES("val_es"),
    VEC_IT("vec_it"),
    VI_VN("vi_vn"),
    YI_DE("yi_de"),
    YO_NG("yo_ng"),
    ZH_CN("zh_cn"),
    ZH_HK("zh_hk"),
    ZH_TW("zh_tw");

    private static final Map<String, EnumLang> lookup = new HashMap<>();

    static {
        for (EnumLang lang : EnumSet.allOf(EnumLang.class))
            lookup.put(lang.getLocale(), lang);
    }

    private final String locale;
    private final Map<String, String> map;


    EnumLang(String locale) {
        this.locale = locale;
        this.map = new HashMap<>();
    }

    public String getLocale() {
        return locale;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public static EnumLang get(String locale) {
        EnumLang result = lookup.get(locale);
        return result == null ? EN_US : result;
    }

}
