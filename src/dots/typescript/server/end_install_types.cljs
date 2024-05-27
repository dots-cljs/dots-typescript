(ns dots.typescript.server.end-install-types)

(defn kind
  "**Returns:** `\"event::endInstallTypes\"`"
  ^js [end-install-types]
  (.-kind ^js end-install-types))

(defn install-success?
  "**Returns:** `boolean`"
  ^js [end-install-types]
  (.-installSuccess ^js end-install-types))

(defn event-id
  "**Returns:** `number`"
  ^js [end-install-types]
  (.-eventId ^js end-install-types))

(defn typings-installer-version
  "**Returns:** `string`"
  ^js [end-install-types]
  (.-typingsInstallerVersion ^js end-install-types))

(defn packages-to-install
  "**Returns:** `readonly string[]`"
  ^js [end-install-types]
  (.-packagesToInstall ^js end-install-types))

(defn project-name
  "**Returns:** `string`"
  ^js [end-install-types]
  (.-projectName ^js end-install-types))
