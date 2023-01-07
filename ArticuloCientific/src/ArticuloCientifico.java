
class ArticuloCientifico {
	private String nombreArticulo;
	private String autor;
	private String palabrasClaves;
	private String nombrePublicacion;
	private int a�o;
	private String resumen;
	
	public ArticuloCientifico (String nombreArticulo, String autor){
		this.nombreArticulo=nombreArticulo;
		this.autor=autor;
	}

	
	
	public ArticuloCientifico (String nombreArticulo, String autor,String palabrasClaves,String nombrePublicacion,int a�o){
		this(nombreArticulo,autor);
		this.palabrasClaves=palabrasClaves;
		this.nombrePublicacion=nombrePublicacion;
		this.a�o=a�o;
	}
	public ArticuloCientifico (String nombreArticulo, String autor,String palabrasClaves,String nombrePublicacion,int a�o,String resumen){
		this(nombreArticulo,autor,palabrasClaves, nombrePublicacion,a�o);
		this.resumen=resumen;
	}
	public void imprimirAtributos() {
		System.out.print("Nombre del articulo: "+this.nombreArticulo+"\nAutor: "+ this.autor+"\nPalabras Claves: "+this.palabrasClaves+"\nNombre de la Publicacion:"+this.nombrePublicacion+"\nA�o:"+this.a�o+"\nResumen:"+this.resumen);
	}
	
}
