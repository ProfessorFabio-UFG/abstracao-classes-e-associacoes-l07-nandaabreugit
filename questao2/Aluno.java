class Aluno {
    private String nome;
    private String matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome, String matricula, int ano, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getMatricula() { 
        return matricula; 
    }
    public void setMatricula(String matricula) { 
        this.matricula = matricula; 
    }

    public int getAno() { 
        return ano; 
    }
    public void setAno(int ano) { 
        this.ano = ano; 
    }

    public Curso getCurso() { 
        return curso; 
    }
    public void setCurso(Curso curso) { 
        this.curso = curso;
        
    }

    public String toString() {
        return "Nome: " + nome + "\nMatrícula: " + matricula + "\nAno: " + ano + "\nCurso: " + curso;
    }
}
