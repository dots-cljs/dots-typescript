(ns dots.typescript.install-package-options)

(defn file-name
  "**Returns:** `Path`"
  ^js [install-package-options]
  (.-fileName ^js install-package-options))

(defn set-file-name!
  ^js [install-package-options value]
  (set! (.-fileName ^js install-package-options) value))

(defn package-name
  "**Returns:** `string`"
  ^js [install-package-options]
  (.-packageName ^js install-package-options))

(defn set-package-name!
  ^js [install-package-options value]
  (set! (.-packageName ^js install-package-options) value))
