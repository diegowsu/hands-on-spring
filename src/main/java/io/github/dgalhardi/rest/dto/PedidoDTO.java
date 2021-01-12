package io.github.dgalhardi.rest.dto;

import io.github.dgalhardi.validation.constraintvalidation.NotEmptyListValidator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {

    @NotNull(message = "{campo.codigo-cliente.obrigatorio}")
    private Integer cliente;

    @NotNull(message = "{campo.total-pedido.obrigatorio}")
    private BigDecimal total;

    @NotEmptyListValidator(message = "{campo.items-pedido.obrigatorio}")
    private List<ItemPedidoDTO> items;

}
