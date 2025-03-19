@RestController
@RequestMapping("/api/despesas")
@Tag(name = "Gestão de Despesas", description = "API para automação de aprovações")
public class DespesaController {

    @PostMapping
    @Operation(summary = "Submeter nova despesa")
    public ResponseEntity<String> submeterDespesa(@RequestBody SolicitacaoDespesaDTO dto) {
        processoService.iniciarProcesso(dto);
        return ResponseEntity.ok("Processo iniciado!");
    }
}