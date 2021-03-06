CREATE TABLE TT_KIJO
   (	CD_KENMEI CHAR(7) NOT NULL COMMENT '内部件名ID' ,
	CD_KAISEN CHAR(4) NOT NULL   COMMENT '回線ID',
	CD_KAITSUKIBO CHAR(5)        COMMENT '開通希望区分',
	YMD_KAITSUKIBO DATETIME      COMMENT '開通希望日',
	KJ_JIGYOSHO VARCHAR(100)     COMMENT '事業所名',
	CD_KEN CHAR(2)               COMMENT '都道府県コード',
	KJ_JUSHO VARCHAR(150)        COMMENT '住所',
	KJ_BUILDING VARCHAR(100)     COMMENT 'ビル名',
	KJ_FLOOR VARCHAR(100)        COMMENT 'フロア数',
	CD_ACCESSSHU CHAR(5)         COMMENT 'アクセス種別コード',
	CD_ACCESSHIN CHAR(5)         COMMENT 'アクセス品目コード',
	KJ_BIKO1 VARCHAR(1000)       COMMENT '備考(中継系＝＞備考)',
	CD_JIGYOSHA CHAR(5)          COMMENT '対象事業者コード',
	CD_TEIKYOKAHI CHAR(5)        COMMENT '提供可否コード',
	KJ_POI VARCHAR(20)           COMMENT 'POI名',
	KJ_KYOKU VARCHAR(20)         COMMENT '収容局名',
	CD_KYORI CHAR(5)             COMMENT '距離区分',
	KJ_MN_POI VARCHAR(20)        COMMENT '見做しPOI名',
	CD_MN_KYORI CHAR(5)          COMMENT '見做し距離区分',
	CD_NYUSEN CHAR(5)            COMMENT '入線状況区分',
	CD_NOKI CHAR(5)              COMMENT '納期(申込書受領後)',
	CD_NYUSEN_END CHAR(1)        COMMENT '終点(CWC-POP)POP入線状況',
	CD_MAYOUHI CHAR(5)           COMMENT 'MA内/外入力要否',
	CD_KS_KYORI CHAR(5)          COMMENT '距離(起点～終点)MA内/外',
	DT_KS_KYORI VARCHAR(10)      COMMENT '距離(起点～終点)実距離(km)',
	NM_KAISEN INT                COMMENT '回線使用料',
	NM_KIKI INT                  COMMENT '機器使用料',
	CD_TEIKYOAREA CHAR(5)        COMMENT '提供エリア内外区分',
	KJ_BIKO2 VARCHAR(1000)       COMMENT '備考(地域系＝＞中継系)',
	TP_CD_KAITSUKIBO CHAR(5)     COMMENT '一時保存-開通希望区分',
	TP_YMD_KAITSUKIBO DATETIME   COMMENT '一時保存-開通希望日',
	TP_KJ_JIGYOSHO VARCHAR(100)  COMMENT '一時保存-事業所名',
	TP_CD_KEN CHAR(2)            COMMENT '一時保存-都道府県コード',
	TP_KJ_JUSHO VARCHAR(150)     COMMENT '一時保存-住所',
	TP_KJ_BUILDING VARCHAR(100)  COMMENT '一時保存-ビル名',
	TP_KJ_FLOOR VARCHAR(100)     COMMENT '一時保存-フロア数',
	TP_CD_ACCESSSHU CHAR(5)      COMMENT '一時保存-アクセス種別コード',
	TP_CD_ACCESSHIN CHAR(5)      COMMENT '一時保存-アクセス品目コード',
	TP_KJ_BIKO1 VARCHAR(1000)    COMMENT '一時保存-備考(中継系＝＞備考)',
	TP_CD_JIGYOSHA CHAR(5)       COMMENT '一時保存-対象事業者コード',
	TP_CD_TEIKYOKAHI CHAR(5)     COMMENT '一時保存-提供可否コード',
	TP_KJ_POI VARCHAR(20)        COMMENT '一時保存-POI名',
	TP_KJ_KYOKU VARCHAR(20)      COMMENT '一時保存-収容局名',
	TP_CD_KYORI CHAR(5)          COMMENT '一時保存-距離区分',
	TP_KJ_MN_POI VARCHAR(20)     COMMENT '一時保存-見做しPOI名',
	TP_CD_MN_KYORI CHAR(5)       COMMENT '一時保存-見做し距離区分',
	TP_CD_NYUSEN CHAR(5)         COMMENT '一時保存-入線状況区分',
	TP_CD_NOKI CHAR(5)           COMMENT '一時保存-納期(申込書受領後)',
	TP_CD_NYUSEN_END CHAR(5)     COMMENT '一時保存-終点(CWC-POP)POP入線状況',
	TP_CD_MAYOUHI CHAR(5)        COMMENT '一時保存-MA内/外入力要否',
	TP_CD_KS_KYORI CHAR(5)       COMMENT '一時保存-距離(起点～終点)MA内/外',
	TP_DT_KS_KYORI VARCHAR(10)   COMMENT '一時保存-距離(起点～終点)実距離(km)',
	TP_NM_KAISEN INT             COMMENT '一時保存-回線使用料',
	TP_NM_KIKI INT               COMMENT '一時保存-機器使用料',
	TP_CD_TEIKYOAREA CHAR(5)     COMMENT '一時保存-提供エリア内外区分',
	TP_KJ_BIKO2 VARCHAR(1000)    COMMENT '一時保存-備考(地域系＝＞中継系)',
	CD_CD_KAITSUKIBO CHAR(5)     COMMENT '状態区分-開通希望区分',
	CD_YMD_KAITSUKIBO CHAR(5)    COMMENT '状態区分-開通希望日',
	CD_KJ_JIGYOSHO CHAR(5)       COMMENT '状態区分-事業所名',
	CD_CD_KEN CHAR(5)            COMMENT '状態区分-都道府県コード',
	CD_KJ_JUSHO CHAR(5)          COMMENT '状態区分-住所',
	CD_KJ_BUILDING CHAR(5)       COMMENT '状態区分-ビル名',
	CD_KJ_FLOOR CHAR(5)          COMMENT '状態区分-フロア数',
	CD_CD_ACCESSSHU CHAR(5)      COMMENT '状態区分-アクセス種別コード',
	CD_CD_ACCESSHIN CHAR(5)      COMMENT '状態区分-アクセス品目コード',
	CD_KJ_BIKO1 CHAR(5)          COMMENT '状態区分-備考(中継系＝＞備考)',
	CD_CD_JIGYOSHA CHAR(5)       COMMENT '状態区分-対象事業者コード',
	CD_CD_TEIKYOKAHI CHAR(5)     COMMENT '状態区分-提供可否コード',
	CD_KJ_POI CHAR(5)            COMMENT '状態区分-POI名',
	CD_KJ_KYOKU CHAR(5)          COMMENT '状態区分-収容局名',
	CD_CD_KYORI CHAR(5)          COMMENT '状態区分-距離区分',
	CD_KJ_MN_POI CHAR(5)         COMMENT '状態区分-見做しPOI名',
	CD_CD_MN_KYORI CHAR(5)       COMMENT '状態区分-見做し距離区分',
	CD_CD_NYUSEN CHAR(5)         COMMENT '状態区分-入線状況区分',
	CD_CD_NOKI CHAR(5)           COMMENT '状態区分-納期(申込書受領後)',
	CD_CD_NYUSEN_END CHAR(5)     COMMENT '状態区分-終点(CWC-POP)POP入線状況',
	CD_CD_MAYOUHI CHAR(5)        COMMENT '状態区分-MA内/外入力要否',
	CD_CD_KS_KYORI CHAR(5)       COMMENT '状態区分-距離(起点～終点)MA内/外',
	CD_DT_KS_KYORI CHAR(5)       COMMENT '状態区分-距離(起点～終点)実距離(km)',
	CD_NM_KAISEN CHAR(5)         COMMENT '状態区分-回線使用料',
	CD_NM_KIKI CHAR(5)           COMMENT '状態区分-機器使用料',
	CD_CD_TEIKYOAREA CHAR(5)     COMMENT '状態区分-提供エリア内外区分',
	CD_KJ_BIKO2 CHAR(5)          COMMENT '状態区分-備考(地域系＝＞中継系)',
	CD_ASGKENMEI CHAR(7)         COMMENT 'ASG件名ID',
	CD_LU_KAISHA CHAR(5)         COMMENT '最終更新者会社コード',
	CD_LU_USER CHAR(50)          COMMENT '最終更新者ユーザID',
	TM_LU DATETIME               COMMENT '最終更新日時',
	CD_LU_CHUKEI_USER CHAR(50)   COMMENT '中継系最終更新者ユーザID',
	TM_LU_CHUKEI DATETIME        COMMENT '中継系最終更新日時',
	CD_LU_CHIIKI_USER CHAR(50)   COMMENT '地域系最終更新者ユーザID',
	TM_LU_CHIIKI DATETIME        COMMENT '地域系最終更新日時',
	CD_LU_ASG_USER CHAR(50)      COMMENT 'ASG最終更新者ユーザID',
	TM_LU_ASG DATETIME           COMMENT 'ASG最終更新日時',
	CD_JT CHAR(5)                COMMENT '回線状態区分',
	CD_COMMENT CHAR(5)           COMMENT '定型コメント',
	TP_CD_COMMENT CHAR(5)        COMMENT '一時保存-定型コメント',
	CD_CD_COMMENT CHAR(5)        COMMENT '状態区分-定型コメント',
	CD_GENCHI_IRAI_MAIL CHAR(5)  COMMENT '現調依頼メール',
	 CONSTRAINT TT_KIJO_PK PRIMARY KEY (CD_KENMEI, CD_KAISEN)) COMMENT = '机上'

