(ns dots.typescript.server.null-typings-installer
  (:require ["typescript" :as typescript]))

(defn known-types-package-name?
  "**Parameters:**
   - `name`: `string`
   
   **Returns:** `boolean`"
  ^js [name]
  (.. typescript/server -nullTypingsInstaller (isKnownTypesPackageName name)))

(defn install-package
  "**Parameters:**
   - `options`: `InstallPackageOptionsWithProject`
   
   **Returns:** `Promise<ApplyCodeActionCommandResult>`"
  ^js [options]
  (.. typescript/server -nullTypingsInstaller (installPackage options)))

(defn enqueue-install-typings-request
  "**Parameters:**
   - `p`: `Project`
   - `type-acquisition`: `TypeAcquisition`
   - `unresolved-imports`: `SortedReadonlyArray<string> | undefined`
   
   **Returns:** `void`"
  (^js [p type-acquisition]
   (.. typescript/server -nullTypingsInstaller (enqueueInstallTypingsRequest p type-acquisition)))
  (^js [p type-acquisition unresolved-imports]
   (.. typescript/server -nullTypingsInstaller (enqueueInstallTypingsRequest p type-acquisition unresolved-imports))))

(defn attach
  "**Parameters:**
   - `project-service`: `ProjectService`
   
   **Returns:** `void`"
  ^js [project-service]
  (.. typescript/server -nullTypingsInstaller (attach project-service)))

(defn on-project-closed
  "**Parameters:**
   - `p`: `Project`
   
   **Returns:** `void`"
  ^js [p]
  (.. typescript/server -nullTypingsInstaller (onProjectClosed p)))

(defn global-typings-cache-location
  ^js []
  (.. typescript/server -nullTypingsInstaller -globalTypingsCacheLocation))
