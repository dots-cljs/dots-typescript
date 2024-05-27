(ns dots.typescript.server.protocol.configure-plugin-request-arguments)

(defn plugin-name
  "**Returns:** `string`"
  ^js [configure-plugin-request-arguments]
  (.-pluginName ^js configure-plugin-request-arguments))

(defn set-plugin-name!
  ^js [configure-plugin-request-arguments value]
  (set! (.-pluginName ^js configure-plugin-request-arguments) value))

(defn configuration
  "**Returns:** `any`"
  ^js [configure-plugin-request-arguments]
  (.-configuration ^js configure-plugin-request-arguments))

(defn set-configuration!
  ^js [configure-plugin-request-arguments value]
  (set! (.-configuration ^js configure-plugin-request-arguments) value))
