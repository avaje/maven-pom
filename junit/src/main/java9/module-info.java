module io.avaje.config {

  exports io.avaje.config;

  requires transitive org.slf4j;
  requires static org.yaml.snakeyaml;

  uses io.avaje.config.ConfigurationSource;
}
