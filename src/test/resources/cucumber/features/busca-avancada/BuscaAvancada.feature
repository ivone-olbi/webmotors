@Busca @BuscaAvancada
Feature: Busca avancada
  Quero poder buscar um veiculo atraves da sua marca e modelo.

  @Sucesso
  Scenario: Devo poder buscar um veiculo atraves da sua marca e modelo
    Given a marca "Ford"
     When modelo "Belina"
     Then vejo os veiculos correspondentes "Belina"