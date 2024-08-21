public class Periodico extends ItemBibliografico {
    String periodicidade;
    int volume;

    public Periodico(String codigo, String titulo, int anoPublicacao, int volume, String periodicidade) {
        super(codigo, titulo, anoPublicacao);
        this.volume = volume;
        this.periodicidade = periodicidade;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean validarCampos(){
        if (periodicidade == null) {
            throw new RuntimeException("Periodicidade não pode estar vazio.");
        }
        if (volume <= 0){
            throw new RuntimeException("O volume não pode ser menor ou igual a 0.");
        }

        return true;
    }
}
