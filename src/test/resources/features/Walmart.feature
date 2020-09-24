@walmart @ebay
Feature: walmart arama
  Scenario Outline:
    Given kullanici "https://walmart.com" adresine gider
    And kllanici walmart aramakutusuna "<kelime>" yazar ve arar
    Then kullanici walmart sonuc sayisini ekrana yazdirir

    Examples: Test verileri
    |kelime    |
    |calculator|
    |watch     |
    |flower    |
