(ns dots.typescript.server.package-installed-response)

(defn kind
  "**Returns:** `\"action::packageInstalled\"`"
  ^js [package-installed-response]
  (.-kind ^js package-installed-response))

(defn id
  "**Returns:** `number`"
  ^js [package-installed-response]
  (.-id ^js package-installed-response))

(defn success?
  "**Returns:** `boolean`"
  ^js [package-installed-response]
  (.-success ^js package-installed-response))

(defn message
  "**Returns:** `string`"
  ^js [package-installed-response]
  (.-message ^js package-installed-response))

(defn project-name
  "**Returns:** `string`"
  ^js [package-installed-response]
  (.-projectName ^js package-installed-response))
