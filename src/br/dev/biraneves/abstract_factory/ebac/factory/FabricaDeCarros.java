package br.dev.biraneves.abstract_factory.ebac.factory;

import br.dev.biraneves.abstract_factory.ebac.product.CarroDeFamilia;
import br.dev.biraneves.abstract_factory.ebac.product.CarroEsportivo;

public interface FabricaDeCarros {

    CarroEsportivo criarCarroEsportivo();
    CarroDeFamilia criarCarroDeFamilia();

}
