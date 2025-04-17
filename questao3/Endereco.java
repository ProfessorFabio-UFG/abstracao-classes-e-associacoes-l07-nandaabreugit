class Endereco {
    protected String rua, complemento, cep, bairro, cidade, estado;
    protected int numero;

    public Endereco(String rua, int numero, String complemento, String cep, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() { 
        return rua; 
    }
    public void setRua(String rua) { 
        this.rua = rua; 
    }

    public int getNumero() { 
        return numero; 
    }
    public void setNumero(int numero) { 
        this.numero = numero; 
    }

    public String getComplemento() { 
        return complemento; 
    }
    public void setComplemento(String complemento) { 
        this.complemento = complemento; 
    }

    public String getCep() { 
        return cep; 
    }
    public void setCep(String cep) { 
        this.cep = cep; 
    }

    public String getBairro() { 
        return bairro; 
    }
    public void setBairro(String bairro) { 
        this.bairro = bairro; 
    }

    public String getCidade() { 
        return cidade; 
    }
    public void setCidade(String cidade) { 
        this.cidade = cidade; 
    }

    public String getEstado() { 
        return estado;
    }
    public void setEstado(String estado) { 
        this.estado = estado; 
    }

    public String toString() {
        return "Rua: " + rua + "\nNumero: " + numero + "\nComplemento: " + complemento + "\nBairro: " + bairro + "\nCidade" + cidade + " - " + estado + " - CEP: " + cep;
    }
}
