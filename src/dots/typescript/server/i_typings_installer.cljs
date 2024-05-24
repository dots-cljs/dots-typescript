(ns dots.typescript.server.i-typings-installer)

(defn known-types-package-name?
  "**Parameters:**
   - `name`: `string`
   
   **Returns:** `boolean`"
  ^js [i-typings-installer name]
  (.isKnownTypesPackageName ^js i-typings-installer name))

(defn install-package
  "**Parameters:**
   - `options`: `InstallPackageOptionsWithProject`
   
   **Returns:** `Promise<ApplyCodeActionCommandResult>`"
  ^js [i-typings-installer options]
  (.installPackage ^js i-typings-installer options))

(defn enqueue-install-typings-request
  "**Parameters:**
   - `p`: `Project`
   - `type-acquisition`: `TypeAcquisition`
   - `unresolved-imports`: `SortedReadonlyArray<string> | undefined`
   
   **Returns:** `void`"
  (^js [i-typings-installer p type-acquisition]
   (.enqueueInstallTypingsRequest ^js i-typings-installer p type-acquisition))
  (^js [i-typings-installer p type-acquisition unresolved-imports]
   (.enqueueInstallTypingsRequest ^js i-typings-installer p type-acquisition unresolved-imports)))

(defn attach
  "**Parameters:**
   - `project-service`: `ProjectService`
   
   **Returns:** `void`"
  ^js [i-typings-installer project-service]
  (.attach ^js i-typings-installer project-service))

(defn on-project-closed
  "**Parameters:**
   - `p`: `Project`
   
   **Returns:** `void`"
  ^js [i-typings-installer p]
  (.onProjectClosed ^js i-typings-installer p))

(defn global-typings-cache-location
  ^js [i-typings-installer]
  (.-globalTypingsCacheLocation ^js i-typings-installer))
