package business.gConta;

public class Cliente {
	private int id;
	private String nome;
	private int telemovel;
	private String email;

    /**
     * Método get para o id de um cliente.
     * @return Id do cliente
     */

    public int getID(){
        return this.id;
    }

    /**
     * Método get para o nome de um cliente.
     * @return Nome do cliente
     */

    public String getNome(){
        return this.nome;
    }

    /**
     * Método get para número de telemóvel de um cliente.
     * @return Número de telemóvel do cliente
     */

    public int getTelemovel() {
        return this.telemovel;
    }

    /**
     * Método get para o email de um cliente.
     * @return Email do cliente
     */

    public String getEmail(){
        return this.email;
    }

    /**
     * Método set para o id de um cliente.
     */

    public void setID(int id){
        this.id = id;
    }

    /**
     * Método set para o nome de um cliente.
     */

    public void setNome(String n){
        this.nome = n;
    }

    /**
     * Método set para o número de telemóvel de um cliente.
     */


    public void setTelemovel(int t){
        this.telemovel = t;
    }

    /**
     * Método set para o email de um cliente.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método para alterar todos os campos de um cliente.
     * @param nome Novo nome.
     * @param tel Novo número de telemóvel.
     * @param mail Novo mail.
     */

    public void setAll(String nome,int tel,String mail) {
        this.nome = nome;
        this.telemovel = tel;
        this.email = mail;
    }

    /**
     * Construtor sem parametros de Cliente.
     */

    public Cliente(){
        this.id = -1;
        this.nome = "";
        this.telemovel = -1;
        this.email = "";
    }

    /**
     * Construtor com parametros de Cliente.
     */

    public Cliente(int id, String nome, int telemovel, String email){
        this.id = id;
        this.nome = nome;
        this.telemovel = telemovel;
        this.email = email;
    }


}