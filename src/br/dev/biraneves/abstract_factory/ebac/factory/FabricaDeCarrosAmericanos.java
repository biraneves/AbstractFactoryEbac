package br.dev.biraneves.abstract_factory.ebac.factory;

import br.dev.biraneves.abstract_factory.ebac.product.CarroDeFamilia;
import br.dev.biraneves.abstract_factory.ebac.product.CarroDeFamiliaAmericano;
import br.dev.biraneves.abstract_factory.ebac.product.CarroEsportivo;
import br.dev.biraneves.abstract_factory.ebac.product.CarroEsportivoAmericano;

public class FabricaDeCarrosAmericanos implements FabricaDeCarros {

    @Override
    public CarroEsportivo criarCarroEsportivo() {
        return new CarroEsportivoAmericano();
    }

    @Override
    public CarroDeFamilia criarCarroDeFamilia() {
        return new CarroDeFamiliaAmericano();
    }

}
