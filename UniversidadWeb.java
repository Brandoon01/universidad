package Universidad;

public class UniversidadWeb {
    
    private String nombre;
    private String fundador;
    private int carreras;
    
    //constructor
    public UniversidadWeb() {
        nombre ="UNIVERSIDAD AGUSTINIANA CAMPUS TAGASTE";
        fundador ="Fray Carlos Alberto Villabona";
        carreras =21;
    }
    //parametros de constructor
    public UniversidadWeb(String nombre, String fundador, int carreras){
        this.nombre=nombre;
        this.fundador=fundador;
        this.carreras=carreras;
    }
    
    //metodo get
    public String getNombre() {
        return nombre;
    }

    public String getFundador() {
        return fundador;
    }

    public int getCarreras() {
        return carreras;
    }
    //metodo set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public void setCarreras(int carreras) {
        this.carreras = carreras;
    }
    
    public static void main(String[] args) {
        //instancia de universidad
        UniversidadWeb universidad1 = new UniversidadWeb();
        
        //mostrar detalles
        System.out.println("UNIVERSIDAD");
        System.out.println("NOMBRE: "+ universidad1.getNombre());
        System.out.println("FUNDADOR: "+ universidad1.getFundador());
        System.out.println("CARRERAS: "+ universidad1.getCarreras());
    }
    
}
