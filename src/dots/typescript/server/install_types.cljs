(ns dots.typescript.server.install-types)

(defn kind
  "**Returns:** `\"event::beginInstallTypes\" | \"event::endInstallTypes\"`"
  ^js [install-types]
  (.-kind ^js install-types))

(defn event-id
  "**Returns:** `number`"
  ^js [install-types]
  (.-eventId ^js install-types))

(defn typings-installer-version
  "**Returns:** `string`"
  ^js [install-types]
  (.-typingsInstallerVersion ^js install-types))

(defn packages-to-install
  "**Returns:** `readonly string[]`"
  ^js [install-types]
  (.-packagesToInstall ^js install-types))

(defn project-name
  "**Returns:** `string`"
  ^js [install-types]
  (.-projectName ^js install-types))
