#languege: en
Feature: Busqueda exitosa con datos extraidos del xlsx

  Scenario: Buscar en google

    Given que me encuentro en el buscador en la pagina BestBuy
    When llamo datos del archivo excel
    Then se hace la busqueda y me muestra resultados del producto seleccionado


