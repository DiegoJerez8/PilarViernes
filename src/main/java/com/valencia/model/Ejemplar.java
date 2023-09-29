package com.valencia.model;

public class Ejemplar {
    
    private int isbn;
    private String titulo;
    private String tematica;
   
    public Ejemplar() {
    }

     public Ejemplar(int isbn, String titulo, String tematica) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.tematica = tematica;
    }


    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTematica() {
        return tematica;
    }
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public String toString() {
        return "Ejemplar [isbn=" + isbn + ", titulo=" + titulo + ", tematica=" + tematica + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + isbn;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((tematica == null) ? 0 : tematica.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ejemplar other = (Ejemplar) obj;
        if (isbn != other.isbn)
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (tematica == null) {
            if (other.tematica != null)
                return false;
        } else if (!tematica.equals(other.tematica))
            return false;
        return true;
    }

    

}
