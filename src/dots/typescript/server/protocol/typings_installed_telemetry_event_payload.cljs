(ns dots.typescript.server.protocol.typings-installed-telemetry-event-payload)

(defn installed-packages
  "Comma separated list of installed typing packages
   
   **Returns:** `string`"
  ^js [typings-installed-telemetry-event-payload]
  (.-installedPackages ^js typings-installed-telemetry-event-payload))

(defn set-installed-packages!
  "Comma separated list of installed typing packages"
  ^js [typings-installed-telemetry-event-payload value]
  (set! (.-installedPackages ^js typings-installed-telemetry-event-payload) value))

(defn install-success?
  "true if install request succeeded, otherwise - false
   
   **Returns:** `boolean`"
  ^js [typings-installed-telemetry-event-payload]
  (.-installSuccess ^js typings-installed-telemetry-event-payload))

(defn set-install-success!
  "true if install request succeeded, otherwise - false"
  ^js [typings-installed-telemetry-event-payload value]
  (set! (.-installSuccess ^js typings-installed-telemetry-event-payload) value))

(defn typings-installer-version
  "version of typings installer
   
   **Returns:** `string`"
  ^js [typings-installed-telemetry-event-payload]
  (.-typingsInstallerVersion ^js typings-installed-telemetry-event-payload))

(defn set-typings-installer-version!
  "version of typings installer"
  ^js [typings-installed-telemetry-event-payload value]
  (set! (.-typingsInstallerVersion ^js typings-installed-telemetry-event-payload) value))
