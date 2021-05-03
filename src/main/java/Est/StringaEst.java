package Est;

public class StringaEst {

    private String value;

    /**
     * Costruttore di base
     */
    public StringaEst(){
        value = null;
    }

    /**
     * Costruttore con parametro
     * @param value valore della stringa
     */
    public StringaEst(String value){
        this.value = value;
    }


    /**
     * Metodo che controlla se la stringa e' vuota
     * @return ritorna vero se la stringa e' vuota
     */
    public boolean isEmpty(){
        return value == null || value == "";
    }


    /**
     * Metodo che controlla se la stringa ha spazi o e' vuota
     * @return ritorna vero se la stringa ha spazi o e' vuota
     */
    public boolean isBlank(){
        return value.matches("^(\s)$") || value == "" || value == null;
    }


    /**
     * Metodo che controlla se la stringa e' formata da soli numeri
     * @return Ritorna vero se la stringa e' composta da numeri
     */
    public boolean isNUmeric(){
        return value.matches("\\d+");
    }


    /**
     * Getter value
     * @return Il valore della stringa value
     */
    public String getValue(){
        return this.value;
    }

}
