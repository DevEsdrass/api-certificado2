package Api_Certificado.main.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api")
    public class EventManagementController {

        @Autowired
        private EventManagementService eventManagementService;

        @PostMapping("/administradores")
        public ResponseEntity<Administrador> criarAdministrador(@RequestBody Administrador administrador) {
            return ResponseEntity.ok(eventManagementService.criarAdministrador(administrador));
        }

        @PostMapping("/eventos")
        public ResponseEntity<Evento> criarEvento(@RequestBody Evento evento) {
            return ResponseEntity.ok(eventManagementService.criarEvento(evento));
        }

        @PostMapping("/inscricoes")
        public ResponseEntity<Inscricao> inscreverUsuario(@RequestParam int usuarioId, @RequestParam int eventoId) {
            Usuario usuario = eventManagementService.buscarUsuario(usuarioId);
            Evento evento = eventManagementService.buscarEvento(eventoId);
            return ResponseEntity.ok(eventManagementService.inscreverUsuario(usuario, evento));
        }

        @PostMapping("/certificados")
        public ResponseEntity<Certificado> gerarCertificado(@RequestParam int usuarioId, @RequestParam int eventoId) {
            Usuario usuario = eventManagementService.buscarUsuario(usuarioId);
            Evento evento = eventManagementService.buscarEvento(eventoId);
            return ResponseEntity.ok(eventManagementService.gerarCertificado(usuario, evento));
        }

        // Other endpoints
    }

