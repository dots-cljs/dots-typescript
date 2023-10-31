(ns dots.typescript.parsed-tsconfig)

(defn raw
  ^js [parsed-tsconfig]
  (.-raw ^js parsed-tsconfig))

(defn set-raw!
  ^js [parsed-tsconfig value]
  (set! (.-raw ^js parsed-tsconfig) value))

(defn options
  ^js [parsed-tsconfig]
  (.-options ^js parsed-tsconfig))

(defn set-options!
  ^js [parsed-tsconfig value]
  (set! (.-options ^js parsed-tsconfig) value))

(defn watch-options
  ^js [parsed-tsconfig]
  (.-watchOptions ^js parsed-tsconfig))

(defn set-watch-options!
  ^js [parsed-tsconfig value]
  (set! (.-watchOptions ^js parsed-tsconfig) value))

(defn type-acquisition
  ^js [parsed-tsconfig]
  (.-typeAcquisition ^js parsed-tsconfig))

(defn set-type-acquisition!
  ^js [parsed-tsconfig value]
  (set! (.-typeAcquisition ^js parsed-tsconfig) value))

(defn extended-config-path
  "Note that the case of the config path has not yet been normalized, as no files have been imported into the project yet"
  ^js [parsed-tsconfig]
  (.-extendedConfigPath ^js parsed-tsconfig))

(defn set-extended-config-path!
  "Note that the case of the config path has not yet been normalized, as no files have been imported into the project yet"
  ^js [parsed-tsconfig value]
  (set! (.-extendedConfigPath ^js parsed-tsconfig) value))
