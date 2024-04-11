package br.dev.biraneves.abstract_factory.ebac.client;

import br.dev.biraneves.abstract_factory.ebac.factory.FabricaDeCarros;
import br.dev.biraneves.abstract_factory.ebac.factory.FabricaDeCarrosAmericanos;
import br.dev.biraneves.abstract_factory.ebac.factory.FabricaDeCarrosEuropeus;
import br.dev.biraneves.abstract_factory.ebac.product.CarroDeFamilia;
import br.dev.biraneves.abstract_factory.ebac.product.CarroEsportivo;

public class Cliente {

    public static void main(String[] args) {

        FabricaDeCarros fabrica;
        CarroEsportivo esportivo;
        CarroDeFamilia familia;

        // Fábrica europeia
        fabrica = new FabricaDeCarrosEuropeus();
        esportivo = fabrica.criarCarroEsportivo();
        familia = fabrica.criarCarroDeFamilia();

        esportivo.exibirInfoCarroEsportivo();
        familia.exibirInfoFamilia();

        // Fábrica americana
        fabrica = new FabricaDeCarrosAmericanos();
        esportivo = fabrica.criarCarroEsportivo();
        familia = fabrica.criarCarroDeFamilia();

        esportivo.exibirInfoCarroEsportivo();
        familia.exibirInfoFamilia();

    }

}
