package clase;

public class ConexiuneBazaDeDate {
    private String denumire;
    private String url;
    private int nrTabele;
    private static ConexiuneBazaDeDate instanta = null; // Singleton

    // class diagram
    // https://www.bing.com/images/search?view=detailV2&ccid=m8BBZ7Nb&id=36158BE8AE8525AB87124976F7B9B410B8AC4102&thid=OIP.m8BBZ7NbBXbKJskaLxnvZgHaCx&mediaurl=https%3a%2f%2fstatic.packt-cdn.com%2fproducts%2f9781786463593%2fgraphics%2f96d762be-a2b2-4f2b-ab2b-d71e98233431.png&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.9bc04167b35b0576ca26c91a2f19ef66%3frik%3dAkGsuBC0ufd2SQ%26pid%3dImgRaw%26r%3d0&exph=469&expw=1255&q=singleton+design+pattern&simid=608011398068833142&FORM=IRPRST&ck=52722DBD5811AD5D35750DAC850D903D&selectedIndex=16&itb=0&ajaxhist=0&ajaxserp=0

    private ConexiuneBazaDeDate(String denumire, String url, int nrTabele) { // constructor PRIVAT
        this.denumire = denumire;
        this.url = url;
        this.nrTabele = nrTabele;
    }

    public static synchronized ConexiuneBazaDeDate getInstance(String denumire, String url, int nrTabele) {
        // synchronized = sa fie thread safe: poate fi apelata doar pe un singur thread
        if (instanta == null) {
            instanta = new ConexiuneBazaDeDate(denumire, url, nrTabele);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "ConexiuneBazaDeDate{" +
                "denumire='" + denumire + '\'' +
                ", url='" + url + '\'' +
                ", nrTabele=" + nrTabele +
                '}';
    }
}
