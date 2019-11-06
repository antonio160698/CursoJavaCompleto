public class Admin implements Imprimable{
    private String usuario;
    private String pass;

    public Admin(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String imprimir() {
        return this.pass+" "+this.usuario;
    }
}
