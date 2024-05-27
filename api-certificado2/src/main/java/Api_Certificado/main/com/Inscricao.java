package Api_Certificado.main.com;

import jakarta.persistence.*;

    @Entity
    public class Inscricao {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @ManyToOne
        @JoinColumn(name = "usuario_id", nullable = false)
        private Usuario usuario;

        @ManyToOne
        @JoinColumn(name = "evento_id", nullable = false)
        private Evento evento;

        private boolean presenca;

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public Evento getEvento() {
            return evento;
        }

        public void setEvento(Evento evento) {
            this.evento = evento;
        }

        public boolean isPresenca() {
            return presenca;
        }

        public void setPresenca(boolean presenca) {
            this.presenca = presenca;
        }
    }

