package model.logic;

public class Comparendo 
{

	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * ObjetID del comparendo
	 */

	private int objectID;

	/**
	 * Fecha del comparendo
	 */

	private String fecha;

	/**
	 * Medio dete del comparendo.
	 */

	private String medioDete;

	/**
	 * Clase de vehiculo del comparendo.
	 */

	private String claseVehiculo;

	/**
	 * Tipo de servicio del vehiculo del comparendo.
	 */

	private String tipoServicio;

	/**
	 * Infraccion del comparendo.
	 */

	private String infraccion;

	/**
	 * Descripcion de la infraccion del comparendo.
	 */

	private String descripInfraccion; 

	/**
	 * Localidad del comparendo.
	 */

	private String localidad;


	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Crea un comparendo con toda la informacion respectiva.
	 * @param pObjectID ObjectID del comparendo.
	 * @param pFecha Fecha del comparendo.
	 * @param pMedioDete Medio dete del comparendo.
	 * @param pClaseVehiculo Clase de vehiculo del comparendo.
	 * @param pTipoServicio Tipo de servicio del vehiculo del comparendo.
	 * @param pInfraccion Infraccion del comparendo.
	 * @param pDesInfraccion Descripcion de la infraccion del comparendo.
	 * @param pLocalidad Localidad del comparendo.
	 */

	public Comparendo(int pObjectID, String pFecha, String pMedioDete, String pClaseVehiculo, String pTipoServicio, String pInfraccion, String pDesInfraccion, String pLocalidad)
	{
		objectID = pObjectID;
		fecha = pFecha; 
		medioDete = pMedioDete;
		claseVehiculo = pClaseVehiculo; 
		tipoServicio = pTipoServicio; 
		infraccion = pInfraccion;
		descripInfraccion = pDesInfraccion;
		localidad = pLocalidad;
	}

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	public int darObjectID()
	{
		return objectID;
	}

	public String darFecha()
	{
		return fecha;
	}

	public String darMedioDete()
	{
		return medioDete;
	}

	public String darClaseVehiculo()
	{
		return claseVehiculo;
	}

	public String darTipoServicio()
	{
		return tipoServicio;
	}

	public String darInfraccion()
	{
		return infraccion;
	}

	public String darDesInfraccion()
	{
		return descripInfraccion;
	}

	public String darLocalidad()
	{
		return localidad;
	}



}
