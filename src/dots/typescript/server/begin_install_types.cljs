(ns dots.typescript.server.begin-install-types)

(defn kind
  "**Returns:** `\"event::beginInstallTypes\"`"
  ^js [begin-install-types]
  (.-kind ^js begin-install-types))

(defn event-id
  "**Returns:** `number`"
  ^js [begin-install-types]
  (.-eventId ^js begin-install-types))

(defn typings-installer-version
  "**Returns:** `string`"
  ^js [begin-install-types]
  (.-typingsInstallerVersion ^js begin-install-types))

(defn packages-to-install
  "**Returns:** `readonly string[]`"
  ^js [begin-install-types]
  (.-packagesToInstall ^js begin-install-types))

(defn project-name
  "**Returns:** `string`"
  ^js [begin-install-types]
  (.-projectName ^js begin-install-types))
