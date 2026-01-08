package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite consultar el saldo, ingresar y retirar dinero.
 * Incluye atributos como nombre del titular, número de cuenta, saldo y tipo de interés.
 */

public class CCuenta {
	/** Nombre del titular */
	private String nombre;
	
	/** Número de la cuenta bancaria */
    private String cuenta;
    
    /** Saldo de la cuenta */
    private double saldo;
    
    /** Tipo de interés de la cuenta */
    private double tipoInteres;

    /** Constructor por defecto para la cuenta*/
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }

    /** 
     * Devuelve el saldo disponible
     * 
     * @return saldo - Devuelve el saldo disponible
     */
        public double estado()
    {
        return saldo;
    }

    /**
     * Ingresa una cantidad de dinero de la cuenta
     * @param cantidad Cantidad a ingresar (debe ser positiva)
     * @throws Exception Si la cantidad es negativa
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
    * Retira una cantidad de dinero de la cuenta
    * @param cantidad - cantidad a retirar 
    * @throws Exception - Si la cantidad es negativa (0 o menor a 0)
    * @throws Exception - La cantidad a retirar es superior al saldo 
    */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
 // Getters y Setters añadidos
    
    /** 
     * Devuelve el Nombre del titular
     * 
     * @return nombre - Nombre del titular
     */
        public String getNombre() {
		return nombre;
	}

    /** 
     * Asigna nuevo nombre del titular
     * 
     * @param nombre - Asigna nuevo nombre del titular
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve el número de cuenta
	 * 
	 *  @return cuenta - Devuelve el número de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/** 
	 * Asigna un nuevo número de cuenta
	 * 
	 * @param cuenta - Asigna un nuevo número de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/** 
	 * Devuelve el Saldo actual
	 * 
	 * @return saldo - Devuelve el Saldo actual 
	 */
	public double getSaldo() {
		return saldo;
	}

	/** 
	 * Asigna Nuevo saldo
	 * 
	 * @param saldo - Asigna Nuevo saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Muestra el tipo de interés de la cuenta
	 *  
	 *  @return tipoInteres - Tipo de interés de la cuenta
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	
	/** 
	 * Asigna un nuevo tipo de interés
	 * 
	 * @param tipoInteres - Asigna un nuevo tipo de interés
	 *  */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
