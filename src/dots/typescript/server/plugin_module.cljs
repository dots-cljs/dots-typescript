(ns dots.typescript.server.plugin-module)

(defn create
  "**Parameters:**
   - `create-info`: `PluginCreateInfo`
   
   **Returns:** `LanguageService`"
  ^js [plugin-module create-info]
  (.create ^js plugin-module create-info))

(defn external-files
  "**Parameters:**
   - `proj`: `Project`
   - `update-level`: `ProgramUpdateLevel`
   
   **Returns:** `string[]`"
  ^js [plugin-module proj update-level]
  (.getExternalFiles ^js plugin-module proj update-level))

(defn on-configuration-changed
  "**Parameters:**
   - `config`: `any`
   
   **Returns:** `void`"
  ^js [plugin-module config]
  (.onConfigurationChanged ^js plugin-module config))
