package br.com.ada.itau950.pedidos.compras.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RealizarPedidoDto {

    private List<PedidoItemDto> itens;

}
