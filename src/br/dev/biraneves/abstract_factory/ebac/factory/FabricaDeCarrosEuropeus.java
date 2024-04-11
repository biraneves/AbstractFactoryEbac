package br.dev.biraneves.abstract_factory.ebac.factory;

import br.dev.biraneves.abstract_factory.ebac.product.CarroDeFamilia;
import br.dev.biraneves.abstract_factory.ebac.product.CarroDeFamiliaEuropeu;
import br.dev.biraneves.abstract_factory.ebac.product.CarroEsportivo;
import br.dev.biraneves.abstract_factory.ebac.product.CarroEsportivoEuropeu;

public class FabricaDeCarrosEuropeus implements FabricaDeCarros {

    @Override
    public CarroEsportivo criarCarroEsportivo() {
        return new CarroEsportivoEuropeu();
    }

    @Override
    public CarroDeFamilia criarCarroDeFamilia() {
        return new CarroDeFamiliaEuropeu();
    }

}
