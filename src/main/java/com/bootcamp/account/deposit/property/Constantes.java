package com.bootcamp.account.deposit.property;

public class Constantes {

  public static final String CHARSET = ";charset=UTF-8";
  public static final String APPLICATION_JSON = "application/json";

  public static final String CODIGO_EXITO = "0";
  public static final String TEXTO_NULL = null;
  public static final String TEXTO_VACIO = "";

  public static final String FORMATOFECHACABECERA = "yyyy-MM-dd'T'HH:mm:ss'Z'";
  public static final String FORMATO_FECHA_DEFAULT = "dd/MM/yyyy HH:mm:ss";
  public static final String FORMATO_FECHA_SP = "yyyy-MM-dd HH:mm:ss";
  public static final String TIMEOUTEXCEPTION = "Timeout";
  public static final String TIMEOUTEXCEPTION2 = "Timed out";
  public static final String PERSISTENCEEXCEPTION = "javax.persistence.PersistenceException";
  public static final String GENERICJDBCEXCEPTION = "org.hibernate.exception";
  public static final String HIBERNATEJDBCEXCEPTION = "The application must supply JDBC connections";
  public static final String EXCEPTIONEMPTYNULL = "Parametro(s) vacio(s)/nulo(s)";
  public final static String SQL_TIMEOUTEXCEPTION = "SQLTimeoutException";
  public static final String SQLTIMEOUTWS = "java.net.SocketTimeoutException";

  /* Unidad de Persistencia */
  public static final String PERSISTENCEUNIT = "claro-post-bonosfullclaro-model";

  public static final String VACIO = "";

  public static final String PROPERTIESEXTERNOS = ".properties";
  public static final String PROPERTIESKEY = "claro.properties";

  public static final String NOMBRERECURSO = "claro-post-bonosfullclaro";

  /* Tags Rest */
  public static final String PATH = "post/bonosfullclaro/v1.0.0";
  public static final String RESOURCE = "/validarCliente";
  public static final String DESCRIPCIONRESOURCE = "Consultar Serie de Interlocutor";
  public static final String API = "api";

  /* Parametros de Auditoria - Header Request Transport */
  public static final String ACCEPT = "accept";
  public static final String IDTRANSACCION = "idTransaccion";
  public static final String MSGID = "msgid";
  public static final String TIMESTAMP = "timestamp";
  public static final String USERID = "userId";
  public static final String NOMBREAPLICACION = "nombreAplicacion";
  public static final String IPAPLICACION = "ipAplicacion";
  public static final String CONTENTTYPE = "Content-Type";

  /* Caracteres */
  public static final String CHAR_PARENTESIS_IZQUIERDO = "(";
  public static final String CHAR_PARENTESIS_DERECHO = ")";
  public static final String CHAR_INTERROGACION = "?";
  public static final String CHAR_COMA = ",";
  public static final String CHAR_PUNTOCOMA = ";";
  public static final String CHAR_PALOTE = "|";
  public static final String CORCHETE = "]";

  /* Numeros Genericos */
  public static final String ZERO = "0";
  public static final String DIEZ = "10";
  public static final String CINCUENTA_UNO = "51";
  public static final String CIEN = "100";
  public static final String UNO_STRING = "1";
  public static final String DOS_STRING = "2";
  public static final String MENOS_NOVENTAYNUEVE = "-99";
  public static final int CERO = 0;
  public static final int UNO = 1;
  public static final int DOS = 2;  

  public static final String A = "A";
  public static final String B = "B";
  public static final String D = "D";
  public static final String MOVIL = "MOVIL";
  public static final String FIJA = "FIJA";
  public static final String ACTIVAR_FIJA = "1";
  public static final String DESACTIVAR_FIJA = "0";

  public static final String REQUEST_HEADER = " RequestHeader: ";
  public static final String REQUEST_BODY = " RequestBody: ";
  public static final String RESPONSE_HEADER = " ResponseHeader: ";
  public static final String RESPONSE_BODY = " ResponseBody: ";
  public static final String USRID = "userId";
  public static final String EXCEPCION_REST = " Excepcion ocurrida en la WS - REST ";
  public static final String EXCEPTION_WS_TIMEOUT_01 = "timed out";
  public static final String EXCEPTION_WS_TIMEOUT_02 = "SocketTimeoutException";
  public static final String EXCEPTION_WS_NO_DISPONIBLE_01 = "RemoteAccessException";
  public static final String EXCEPTION_WS_NO_DISPONIBLE_02 = "404";
  public static final String EXCEPTION_WS_NO_DISPONIBLE_03 = "WebServiceException";
  public static final String EXCEPTION_WS_NO_DISPONIBLE_04 = "ConnectException";
  public static final String EXCEPTION_WS_NO_DISPONIBLE_05 = "ConnectException";
  public static final String EX_CON_CORCHETE = "[$ex]";

  public static final String SEPARADOR = "----------------------------------------------------------";
  public static final String ERROR_EXCEPTION = " [Error Exception]: ";
  public static final String MILISEGUNDOS = "milisegundos";
  public static final String LOG_MDC_PUT = "dataAudit";
  public static final String RESPONSE = " Response: ";
  public static final String SALTO_LINEA = " \n";
  public static final String CORCHETE_IZQUIERDO = "'['";
  public static final String CORCHETE_DERECHO = "']'";
  public static final String VALOR_MENSAJE = "$MSJ";
  public static final CharSequence TIMEOUT = "TIMEOUT";
  public static final String CONNECT_TIMEOUT = "CONNECT_TIMEOUT";
  public static final String REQUEST_TIMEOUT = "REQUEST_TIMEOUT";

  public static final String ERROR_EJECUCION_SP = " Error en la ejecucion del SP : ";
  public static final String ERROR_EJECUCION_FN = " Error en la ejecucion de la FN : ";
  public static final String TEXTOVACIO = "";
  public static final String VARIABLE_DB = "$bd";
  public static final String VARIABLE_SP = "$sp";
  public static final String INICIO_METODO = "INICIO METODO: ";
  public static final String SEPARADORPUNTO = ".";
  public static final String EJECUTAR_SP = " Ejecutando SP: ";
  public static final String EJECUTAR_FN = " Ejecutando FN: ";

  public static final String PARAMETROSSALIDA = "Parametros de salida: ";

  public static final String ESPACIO = " ";
  public static final String IGUAL = "=";

  public static final String TRACE = " [TRACE] ";
  public static final String CODE = " [CODE]= ";
  public static final String MSG = " [MSG]= ";
  public static final String ERROR = "[ERROR]: ";

  public static final String TEXTO_ERROR = " Ocurrio un error: ";

  public final static String INICIO = "[Inicio: ";
  public final static String FIN = "[Fin: ";

  public static final String EXCEPTION_OCURRIDA = "Excepcion ocurrida: ";

  public static final String CHAR_CORCHETE_IZQUIERDO = " [";

  public final static String ID_TXT = " idTx=";
  public final static String MSG_ID = " msgid=";

  public static final String PARAMETROSENTRADA = "Parametros de entrada: ";

  public static final String PARAMETROSOBLIGATORIOS = "----0. Validar parametros obligatorios ------";
  public static final String VALIDACIONPARAMETROSCORRECTOS = " Validacion correcta de parametros de entrada";
  public static final String VALIDACIONPARAMETROSINCORRECTOS = " Parametros de entrada no cumple validacion";
  public static final String DEVOLVERRESPONSE = " Response a devolver: ";

  public final static String TIEMPO_TOTAL = " ] Tiempo total de proceso (ms):";

  public final static String REPLACEMETODO = "";
  public final static String REPLACEWS = "";

  public static final String METODO = "$metodo";

  public static final String WS = "$ws";

  public final static String FIN_METODO = "FIN METODO: ";

  public static final String TIEMPO_TOTAL_SP = " Tiempo total de proceso del llamado del SP (ms): ";
  public static final String INVOCO_SP = " Se invoco con exito el SP";

  public static final String RESULT = "result";
  public static final char DOSPUNTOS = ':';
  public static final char PUNTO = '.';

  /* ENCODING */
  public static final String defaulEncodingProperties = "ISO-8859-1";
  public static final String defaulEncodingApi = "UTF-8";
  public static final String FORMATOFECHADEFAULT = "dd/MM/yyyy HH:mm:ss";
  public static final String DEFAULTENCONDINGAPI = "UTF-8";
  public static final String DEFAULTENCONDIGPROPERTIES = "ISO-8859-1";

  public static final String FORMATO_FECHA_RESPONSE = "dd/MM/yyyy";

  // CONSTANTES DEL SERVICIO
  public static final String PATH_METODO_ACT_DES_BON_FC = "/activarDesactivarBonosFc";
  public static final String METODO_ACT_DES_BON_FC = "activarDesactivarBonosFc";
  
  public static final String PATH_METODO_ELI_BON_FC = "/eliminarBonosFc";
  public static final String PATH_METODO_ACT_DESACT_BONO= "/actDesactBonoMP";
  public static final String METODO_ELI_BON_FC = "eliminarBonosFc";
  public static final String METODO_ACT_DESACT_BONO = "actDesactBonoMP";

  public static final String PATH_METODO_CONSULTA_FIJA_FC = "/consultaFijaFC";
  public static final String METODO_CONSULTA_FIJA_FC = "consultaFijaFC";

  public static final String ORACLEDRIVER = "oracle.jdbc.driver.OracleDriver";
  public static final String CONNECT_TIMEOUT_SEG = "CONNECT_TIMEOUT [seg]: ";
  public static final String QUERY_TIMEOUT_SEG = "QUERY_TIMEOUT [seg]: ";
  public static final String READ_TIMEOUT = "READ_TIMEOUT [ms]: ";
  public static final String CANNOT_GET_CONNECTION = "Cannot get connection: ";
  public static final String TEXTOERRORSQLEXCEPTION = "SQLEXCEPTION: ";
  public static final String TEXTOJNDI = "JNDI : ";
  public static final String CONEXIONBD = " Se conecto a la BD : ";

  public static final String GUION = "-";
  public static final String CONSULTANDO = "Consultando";
  public static final String CALL = "call ";
  
  public static final String UTF16_CABECERA = "<?xml version='1.0' encoding='UTF-16'?>";
  public static final String PKG_CANONICAL_CABECERA = "pe.com.claro.post.bonosfullclaro.canonical.types.";
  public static final String PKG_DOMAIN_CABECERA = "pe.com.claro.post.bonosfullclaro.domain.bean";

  public static final String INVOCAR_EXITO = "Se invoco con exito el SP: {%sp%}";

  public static final String MENSAJEERRORTIMEOUT = "Error de Time Out Exception";
  public final static int STATUS_TIME_OUT = 504;
  public final static int STATUS_DISPONIBILIDAD = 404;
  
  public static final String T_PROM_POSTVTA_DATOS_CLIE_SE = "T_PROM_POSTVTA_DATOS_CLIE_SE";
  public static final String T_PROM_POSTVTA_DATOS_OPERA_SE = "T_PROM_POSTVTA_DATOS_OPERA_SE";
  public static final String T_PROM_POSTVTA_LISTA_LINEA_SE = "T_PROM_POSTVTA_LISTA_LINEA_SE";
  public static final String T_PROM_POSTVTA_DATOS_LINEA_SE = "T_PROM_POSTVTA_DATOS_LINEA_SE";
  public static final String T_PROM_POSTVTA_LISTA_BONO_SE = "T_PROM_POSTVTA_LISTA_BONO_SE";
  public static final String T_PROM_POSTVENTA_BONO_SINEVAL = "T_PROM_POSTVENTA_BONO_SINEVAL";
  public static final String T_PROM_LISTADOCLIENTE = "T_PROM_LISTADOCLIENTE";
  public static final String T_PROM_DATOS_LISTACLIENTE = "T_PROM_DATOS_LISTACLIENTE";
  
  public static final String T_PROM_LISTA_DESA_BONO_DEMANDA = "T_PROM_LISTA_DESA_BONO_DEMANDA";
  public static final String T_PROM_DESACT_BONO_DEMANDA = "T_PROM_DESACT_BONO_DEMANDA";

  public static final String PO_COD_ERR = "PO_COD_ERR";
  public static final String PO_DES_ERR = "PO_DES_ERR";
  
  public static final String ACT1_CREAR_CREDIT_CONSUMPTION = "Actividad 1. Crear credito de consumo";
  //public static final String ACT1_1_CONSULTAR_PIVOT_LINEA = "Actividad 1.1. Consultar pivot linea request";
  //public static final String ACT1_2_ASIGNAR_BONO_FIJA_ASIS = "Actividad 1.2.  Asignar bono fija ASIS";
  
  public static final String ID_VENTA="ID_VENTA";
  public static final String ID_CONTRATO="ID_CONTRATO";
  public static final String TIPO_DOCUMENTO="TIPO_DOCUMENTO";
  public static final String NRO_DOCUMENTO="NRO_DOCUMENTO";
  public static final String FECHA_PAGO="FECHA_PAGO";
  public static final String CONTN_NUMERO_SEC="CONTN_NUMERO_SEC";
  public static final String CONTC_TIPO_PRODUCTO="CONTC_TIPO_PRODUCTO";
  public static final String PLAN_TARIFAR="PLAN_TARIFAR";
  public static final String PLAN_TARIFAR_DESC="PLAN_TARIFAR_DESC";
  public static final String TELEFONO="TELEFONO";
  
  public static final String CBC_VALIDA_FULLCLARO_BONO_ID = "BONO_ID";
  public static final String CBC_VALIDA_FULLCLARO_CBV_DES_GRP = "CBV_DES_GRP";
  public static final String CBC_VALIDA_FULLCLARO_CBI_NO_GRP = "CBI_NO_GRP";
  public static final String CBC_VALIDA_FULLCLARO_CBV_DESCRIPCION = "CBV_DESCRIPCION";
  public static final String CBC_VALIDA_FULLCLARO_CBIO_CO_CARACT_EXCEL = "CBI_CO_CARACT_EXCL";
  public static final String CBC_VALIDA_FULLCLARO_CBV_DES_EXCL = "CBV_DES_EXCL";
  public static final String CBC_VALIDA_FULLCLARO_SUBSCRIPT = "SUBSCRIPT";
  public static final String CBC_VALIDA_FULLCLARO_CARGO_FIJO = "CARGOFIJO";
  public static final String CBC_VALIDA_FULLCLARO_CBV_CHARACTERISTIC = "CBV_CHARACTERISTIC";
  public static final String CBC_VALIDA_FULLCLARO_CBV_VALUE = "CBV_VALUE";
  public static final String CBC_VALIDA_FULLCLARO_CBC_BLOQ_ACT = "CBC_BLOQ_ACT";
  public static final String CBC_VALIDA_FULLCLARO_CBC_BLOQ_DES = "CBC_BLOQ_DES";
  public static final String CBC_VALIDA_FULLCLARO_DAPO = "DAPO";
  public static final String CBC_VALIDA_FULLCLARO_TIPO = "TIPO";
  public static final String CBC_VALIDA_FULLCLARO_CBV_DES_CATEG = "CBV_DES_CATEG";
  public static final String COUNT_UPDATED = "COUNT_UPDATED";
  public static final String COUNT_NOT_MATCHED = "COUNT_NOT_MATCHED";
  public static final String RESPONSE_MSISDN = "MSISDN";
  public static final String RESPONSE_EVENT = "EVENT";

  
  /* [consultaClienteFC - M4] */
  public static final String M4_A1 = "[ 1. Obtener lineas fijas activas bscs9 ]";
  public static final String M4_A2 = "[ 2. Validar FC fijas TOBE ]";
  public static final String M4_A2_1 = "[ 2.1 Obtener lineas con bono FC ]";
  public static final String M4_A2_2 = "[ 2.2 Validar si plan es FC ]";
  public static final String M4_A2_3 = "[ 2.3 Obtener programaciones ]";
  public static final String M4_A2_4 = "[ 2.4 Obtener datos de la linea por coId ]";
  public static final String M4_A2_5 = "[ 2.5 Validar plan destino ]";
  public static final String M4_A3 = "[ 3. Validar FC fijas ASIS ]";
  public static final String M4_A3_1 = "[ 3.1 Validar lineas que apliquen beneficio ]";
  public static final String M4_A3_2 = "[ 3.2 Validar lineas ASIS con bono ]";
  public static final String M4_A3_3 = "[ 3.3 Consultar sot por cambio de plan ]";
  public static final String M4_A3_4 = "[ 3.4 Obtener líneas en ONHOLD ]";
  public static final String M4_A4 = "[ 4. Traer lineas del cliente ]";
  public static final String M4_A5 = "[ 5. Compara la actividad 2 y 3 con la 4 ]";


  public static final String METODO_GET_LINEASXNRODOC = "getLineasxNroDoc";
  public static final String DAO = "DAO";
  public static final String LOGS_PARAMETROS_INPUT_BD = "Parametros INPUT: ";
  public static final String PARAMETROS = "PARAMETROS";
  public static final String ERROREXCEPTION = "Error [Exception]";
  public static final String CONSTANTETIEMPOPROCESO = "Tiempo total de proceso del llamado del SP {%sp%} (ms):{%ms%} ";
  public static final String HFC = "HFC";
  public static final String P_SI = "SI";
  public static final String ESTADO_PROGRAMADA = "P";
  public static final String ESTADO_CANDIDATA = "S";
  public static final String ESTADO_SS = "SS";
  public static final String FULLCLARO_SI = "S";
  public static final String ESTADO_SOT = "17";
  //public static final String FULLCLARO_NO = "N";
  public static final String REQUEST_VALIDA_FIJA_FC = "*";
  public static final String ORIGEN_ASIS = "7";
  public static final String ORIGEN_TOBE = "9";
  public static final String TAREA_PROGRAMADA_NO = "NO";
  public static final String TAREA_PROGRAMADA_SI = "SI";
  public static final String SC_PENDIENTE = "p";
  public static final String SC_ACTIVO = "a";
  public static final String SC_SUSPENDIDO = "s";
  public static final String SC_DESACTIVO = "d";
  public static final String SC_RESERVADO = "o";
  public static final String SCCODE_PENDIENTE = "1";
  public static final String SCCODE_ACTIVO = "2";
  public static final String SCCODE_SUSPENDIDO = "3";
  public static final String SCCODE_DESACTIVO = "4";
  public static final String SCCODE_RESERVADO = "5";

  // SP_getLineasxNroDoc (LND)
  public static final String LND_PI_TIPO_DOC = "PI_TIPO_DOC";
  public static final String LND_PI_NRO_DOCU = "PI_NRO_DOCU";
  public static final String LND_PI_BONOS_PO = "PI_BONOS_PO";
  public static final String LND_PO_CUR_DETALLE = "PO_CUR_DETALLE";
  public static final String LND_PO_ERRNUM = "PO_ERRNUM";
  public static final String LND_PO_ERRMSJ = "PO_ERRMSJ";

  // CURSOR LND (LND_CURSOR)
  public static final String LND_CURSOR_TIPO_DOC = "TIPO_DOC";
  public static final String LND_CURSOR_NRO_DOC = "NRO_DOC";
  public static final String LND_CURSOR_CUSTOMERID = "CUSTOMERID";
  public static final String LND_CURSOR_CUSTOMERIDPUB = "CUSTOMERIDPUB";
  public static final String LND_CURSOR_COID = "COID";
  public static final String LND_CURSOR_COIDPUB = "COIDPUB";
  public static final String LND_CURSOR_COSTATUS = "COSTATUS";
  public static final String LND_CURSOR_LINEA = "LINEA";
  public static final String LND_CURSOR_TIPO_SERVICIO = "TIPO_SERVICIO";
  public static final String LND_CURSOR_POIDBASICO = "POIDBASICO";
  public static final String LND_DESC_POIDBASICO = "DESC_POIDBASICO";
  public static final String LND_FECHA_ACTIVA = "FECHA_ACTIVA";


  /* SP_DATOS_SERVICIO_CO_ID */
  public static final String SP_DATOS_SERVICIO_CO_ID_PI_P_CO_ID = "P_CO_ID";
  public static final String SP_DATOS_SERVICIO_CO_ID_PO_P_CURSOR = "P_CURSOR";
  public static final String SP_DATOS_SERVICIO_CO_ID_PO_P_RESULTADO = "P_RESULTADO";
  public static final String SP_DATOS_SERVICIO_CO_ID_PO_P_MSGERR = "P_MSGERR";

  /* CURSOR DATOS_SERVICIO */
  public static final String CURSOR_DATOS_SERVICIO_MSISDN = "MSISDN";
  public static final String CURSOR_DATOS_SERVICIO_CO_ID = "CO_ID";
  public static final String CURSOR_DATOS_SERVICIO_FECHA_ACTIVACION = "FECHA_ACTIVACION";
  public static final String CURSOR_DATOS_SERVICIO_ESTADO = "ESTADO";
  public static final String CURSOR_DATOS_SERVICIO_FECHA_ESTADO = "FECHA_ESTADO";
  public static final String CURSOR_DATOS_SERVICIO_MOTIVO_ESTADO = "MOTIVO_ESTADO";
  public static final String CURSOR_DATOS_SERVICIO_COD_PLAN = "COD_PLAN";
  public static final String CURSOR_DATOS_SERVICIO_PLAN_TARIFARIO = "PLAN_TARIFARIO";
  public static final String CURSOR_DATOS_SERVICIO_PLAZO_ACUERDO = "PLAZO_ACUERDO";
  public static final String CURSOR_DATOS_SERVICIO_PTO_VENTA = "PTO_VENTA";
  public static final String CURSOR_DATOS_SERVICIO_VENDEDOR = "VENDEDOR";
  public static final String CURSOR_DATOS_SERVICIO_CAMPANA = "CAMPANA";
  public static final String CURSOR_DATOS_SERVICIO_INTERNET = "INTERNET";
  public static final String CURSOR_DATOS_SERVICIO_TELEFONIA = "TELEFONIA";
  public static final String CURSOR_DATOS_SERVICIO_CABLE_TV = "CABLE_TV";

  /* SIACSS_CONSULTAR_SOT */
  public static final String SP_SIACSS_CONSULTAR_SOT_PI_N_NUMERODOC = "N_NUMERODOC";
  public static final String SP_SIACSS_CONSULTAR_SOT_PO_CODIGO_RPTA = "CODIGO_RPTA";
  public static final String SP_SIACSS_CONSULTAR_SOT_PO_MESAJE_RPTA = "MESAJE_RPTA";
  public static final String SP_SIACSS_CONSULTAR_SOT_PI_CUR_SOT = "CUR_SOT";

  
  public static final String METODO_VALIDACANDIDATO = "validaCandidatoBono";

  // BSCSSS_CONSU_CANDIDATO_BONO
  public static final String SP_BSCSSS_CONSU_CANDIDATO_BONO_PI_TIPODOCUMENTO = "PI_TIPODOCUMENTO";
  public static final String SP_BSCSSS_CONSU_CANDIDATO_BONO_PI_DOCUMENTO = "PI_DOCUMENTO";
  public static final String SP_BSCSSS_CONSU_CANDIDATO_BONO_PO_COD_ETIQ = "PO_COD_ETIQ";
  public static final String SP_BSCSSS_CONSU_CANDIDATO_BONO_PO_CURSOR = "PO_CURSOR";
  public static final String SP_BSCSSS_CONSU_CANDIDATO_BONO_PO_CODERROR = "PO_CODERROR";
  public static final String SP_BSCSSS_CONSU_CANDIDATO_BONO_PO_MSJERROR = "PO_MSJERROR";

  // CURSOR_PO_CURSOR BSCSSS_CONSU_CANDIDATO_BONO
  public static final String SP_CONSU_CURSOR_PO_CURSOR_CO_ID = "CO_ID";
  public static final String SP_CONSU_CURSOR_PO_CURSOR_LINEA = "LINEA";
  public static final String SP_CONSU_CURSOR_PO_CURSOR_TIP_SERVICIO = "TIPO_SERVICIO";
  public static final String SP_CONSU_CURSOR_PO_CURSOR_TMCODE = "TMCODE";
  public static final String SP_CONSU_CURSOR_PO_CURSOR_DES_TMCODE = "DES_TMCODE";
  public static final String SP_CONSU_CURSOR_PO_CURSOR_CUSTOMER_ID = "CUSTOMER_ID";

  
  // BSCSSS_CONSULTA_FC_FIJA_MOVIL
  public static final String SP_BSCSSS_CONSULTA_FC_FIJA_MOVIL_PI_TIPODOCUMENTO = "PI_TIPODOCUMENTO";
  public static final String SP_BSCSSS_CONSULTA_FC_FIJA_MOVIL_PI_DOCUMENTO = "PI_DOCUMENTO";
  public static final String SP_BSCSSS_CONSULTA_FC_FIJA_MOVIL_PI_LINEA = "PI_LINEA";
  public static final String SP_BSCSSS_CONSULTA_FC_FIJA_MOVIL_PO_CURSOR = "PO_CURSOR";
  public static final String SP_BSCSSS_CONSULTA_FC_FIJA_MOVIL_PO_CODERROR = "PO_CODERROR";
  public static final String SP_BSCSSS_CONSULTA_FC_FIJA_MOVIL_PO_MSJERROR = "PO_MSJERROR";
  
  // CURSOR_PO_CURSOR BSCSSS_CONSULTA_FC_FIJA_MOVIL 
  public static final String SP_CONSULTA_FC_FIJA_MOVIL_PO_CURSOR_CONTRATO = "CONTRATO";
  public static final String SP_CONSULTA_FC_FIJA_MOVIL_PO_LINEA = "LINEA";
  public static final String SP_CONSULTA_FC_FIJA_MOVIL_PO_TIPO_SERVICIO = "TIPO_SERVICIO";
  public static final String SP_CONSULTA_FC_FIJA_MOVIL_PO_TMCODE = "TMCODE";
  public static final String SP_CONSULTA_FC_FIJA_MOVIL_PO_DES_TMCODE = "DES_TMCODE";
  public static final String SP_CONSULTA_FC_FIJA_MOVIL_PO_BONO_ID = "BONO_ID";
  public static final String SP_CONSULTA_FC_FIJA_MOVIL_PO_ESTADO_BONO = "ESTADO_BONO";
  public static final String SP_CONSULTA_FC_FIJA_MOVIL_PO_BONO_DES = "BONO_DES";
  public static final String SP_CONSULTA_FC_FIJA_MOVIL_PO_CUSTOMER_ID = "CUSTOMER_ID";


  /* SIACSS_PLAN_FIJA_CAMP */
  public static final String SP_SIACSS_PLAN_FIJA_CAMP_PI_OFERTA = "PI_OFERTA";
  public static final String SP_SIACSS_PLAN_FIJA_CAMP_PI_OFICINA = "PI_OFICINA";
  public static final String SP_SIACSS_PLAN_FIJA_CAMP_PI_OFICINADEFAULT = "PI_OFICINADEFAULT";
  public static final String SP_SIACSS_PLAN_FIJA_CAMP_PI_TIPO_PRODUCTO = "PI_TIPO_PRODUCTO";
  public static final String SP_SIACSS_PLAN_FIJA_CAMP_PI_FLAG_EJECUCION = "PI_FLAG_EJECUCION";
  public static final String SP_SIACSS_PLAN_FIJA_CAMP_PO_CONSULTA = "PO_CONSULTA";

  /* CURSOR PLAN_FIJA_CAMP */
  public static final String CURSOR_PLAN_FIJA_CAMP_COD_PLAN_SISACT = "COD_PLAN_SISACT";
  public static final String CURSOR_PLAN_FIJA_CAMP_DES_PLAN_SISACT = "DES_PLAN_SISACT";
  public static final String CURSOR_PLAN_FIJA_CAMP_SOLUCION = "SOLUCION";
  public static final String CURSOR_PLAN_FIJA_CAMP_TMCODE = "TMCODE";
  public static final String CURSOR_PLAN_FIJA_CAMP_DES_TMCODE = "DES_TMCODE";
  public static final String CURSOR_PLAN_FIJA_CAMP_VERSION = "VERSION";
  public static final String CURSOR_PLAN_FIJA_CAMP_CAT_PROD = "CAT_PROD";
  public static final String CURSOR_PLAN_FIJA_CAMP_TIPO_PROD = "TIPO_PROD";
  public static final String CURSOR_PLAN_FIJA_CAMP_COD_PLANO = "COD_PLANO";
  public static final String CURSOR_PLAN_FIJA_CAMP_USER_CREA = "USER_CREA";
  public static final String CURSOR_PLAN_FIJA_CAMP_PLNC_ESTADO = "PLNC_ESTADO";
  public static final String CURSOR_PLAN_FIJA_CAMP_CAMPV_CODIGO = "CAMPV_CODIGO";
  public static final String CURSOR_PLAN_FIJA_CAMP_CAMPV_DESCRIPCION = "CAMPV_DESCRIPCION";
  public static final String CURSOR_PLAN_FIJA_CAMP_CAMPD_FECHA_FIN = "CAMPD_FECHA_FIN";


  /* SIACSS_SERVICIO_X_DOCUMENTO */
  public static final String SP_SIACSS_SERVICIO_X_DOCUMENTO_PI_TIPO_DOC = "pi_tipo_doc";
  public static final String SP_SIACSS_SERVICIO_X_DOCUMENTO_PI_NRO_DOC = "pi_nro_doc";
  public static final String SP_SIACSS_SERVICIO_X_DOCUMENTO_PO_CUR_DATOS = "po_cur_datos";
  public static final String SP_SIACSS_SERVICIO_X_DOCUMENTO_PO_RESP_CODE = "po_resp_code";
  public static final String SP_SIACSS_SERVICIO_X_DOCUMENTO_PO_RESP_MSG = "po_resp_msg";

  /* CURSOR SERVICIO_X_DOCUMENTO */
  public static final String CURSOR_SERVICIO_X_DOCUMENTO_CO_ID = "CO_ID";
  public static final String CURSOR_SERVICIO_X_DOCUMENTO_DESC_PLAN = "DESC_PLAN";
  public static final String CURSOR_SERVICIO_X_DOCUMENTO_DN_NUM = "DN_NUM";
  public static final String CURSOR_SERVICIO_X_DOCUMENTO_TIP_PROD = "TIP_PROD";
  public static final String CURSOR_SERVICIO_X_DOCUMENTO_COD_PLAN = "COD_PLAN";


  /* SIACSS_SERVICIOS_FIJA */
  public static final String SP_SIACSS_SERVICIOS_FIJA_PI_P_PLAN = "P_PLAN";
  public static final String SP_SIACSS_SERVICIOS_FIJA_PI_P_TIPO_PRODUCTO = "P_TIPO_PRODUCTO";
  public static final String SP_SIACSS_SERVICIOS_FIJA_PO_P_CURSOR = "P_CURSOR";

  /* CURSOR SIACSS_SERVICIOS_FIJA */
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_COD_PLAN_SISACT = "COD_PLAN_SISACT";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_DES_PLAN_SISACT = "DES_PLAN_SISACT";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_TMCODE = "TMCODE";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_SOLUCION = "SOLUCION";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_COD_SERV_SISACT = "COD_SERV_SISACT";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_SNCODE = "SNCODE";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_SPCODE = "SPCODE";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_COD_TIPO_SERVICIO = "COD_TIPO_SERVICIO";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_TIPO_SERVICIO = "TIPO_SERVICIO";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_DES_SERV_SISACT = "DES_SERV_SISACT";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_COD_GRUPO_SERV = "COD_GRUPO_SERV";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_GRUPO_SERV = "GRUPO_SERV";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_CF = "CF";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_IDEQUIPO = "IDEQUIPO";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_EQUIPO = "EQUIPO";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_CANT_EQUIPO = "CANT_EQUIPO";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_CODTIPEQU = "CODTIPEQU";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_DSCEQU = "DSCEQU";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_TIPEQU = "TIPEQU";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_COD_EXTERNO = "COD_EXTERNO";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_DES_COD_EXTERNO = "DES_COD_EXTERNO";
  public static final String CURSOR_SIACSS_SERVICIOS_FIJA_SERVV_USUARIO_CREA = "SERVV_USUARIO_CREA";


  /* CURSOR BSCSSS_VALIDA_MOVIL_FIJA */
  public static final String CURSOR_BSCSSS_VALIDA_MOVIL_FIJA_GRUPO = "GRUPO";
  public static final String CURSOR_BSCSSS_VALIDA_MOVIL_FIJA_TMCODE = "TMCODE";
  public static final String CURSOR_BSCSSS_VALIDA_MOVIL_FIJA_PLAN_PVU = "PLAN_PVU";
  public static final String CURSOR_BSCSSS_VALIDA_MOVIL_FIJA_TIPO = "TIPO";
  public static final String CURSOR_BSCSSS_VALIDA_MOVIL_FIJA_VERIFICA = "VERIFICA";
  

  /* SGASS_CONSULTAR_SOT_CP */
  public static final String SP_SGASS_CONSULTAR_SOT_CP_PI_N_NUMERODOC = "N_NUMERODOC";
  public static final String SP_SGASS_CONSULTAR_SOT_CP_PO_CODIGO_RPTA = "CODIGO_RPTA";
  public static final String SP_SGASS_CONSULTAR_SOT_CP_PO_MESAJE_RPTA = "MESAJE_RPTA";
  public static final String SP_SGASS_CONSULTAR_SOT_CP_PO_CUR_SOT = "CUR_SOT";

  /* BSCSSS_VALIDA_CANDIDATO_ONHOLD */
  public static final String SP_BSCSSS_VALIDA_CANDIDATO_ONHOLD_PI_DOCUMENTO = "PI_DOCUMENTO";
  public static final String SP_BSCSSS_VALIDA_CANDIDATO_ONHOLD_PI_TIPODOCUMENTO = "PI_TIPODOCUMENTO";
  public static final String SP_BSCSSS_VALIDA_CANDIDATO_ONHOLD_PO_CODERROR = "PO_CODERROR";
  public static final String SP_BSCSSS_VALIDA_CANDIDATO_ONHOLD_PO_MSJERROR = "PO_MSJERROR";
  public static final String SP_BSCSSS_VALIDA_CANDIDATO_ONHOLD_PO_CURSOR = "PO_CURSOR";

  /*CURSOR BSCSSS_VALIDA_CANDIDATO_ONHOLD */
  public static final String CURSOR_BSCSSS_VALIDA_CANDIDATO_ONHOLD_CO_ID = "CO_ID";
  public static final String CURSOR_BSCSSS_VALIDA_CANDIDATO_ONHOLD_LINEA = "LINEA";
  public static final String CURSOR_BSCSSS_VALIDA_CANDIDATO_ONHOLD_TIPO_SERVICIO = "TIPO_SERVICIO";
  public static final String CURSOR_BSCSSS_VALIDA_CANDIDATO_ONHOLD_TMCODE = "TMCODE";
  public static final String CURSOR_BSCSSS_VALIDA_CANDIDATO_ONHOLD_DES_TMCODE = "DES_TMCODE";
  public static final String CURSOR_BSCSSS_VALIDA_CANDIDATO_ONHOLD_CUSTOMER_ID = "CUSTOMER_ID";
  
  //CREDIT
  public static final String CREDIT_ID = "creditId:";

}
