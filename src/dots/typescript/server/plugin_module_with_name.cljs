(ns dots.typescript.server.plugin-module-with-name
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `string`"
  ^js [plugin-module-with-name]
  (.-name ^js plugin-module-with-name))

(defn set-name!
  ^js [plugin-module-with-name value]
  (set! (.-name ^js plugin-module-with-name) value))

(defn module
  "**Returns:** `PluginModule`"
  ^js [plugin-module-with-name]
  (.-module ^js plugin-module-with-name))

(defn set-module!
  ^js [plugin-module-with-name value]
  (set! (.-module ^js plugin-module-with-name) value))
