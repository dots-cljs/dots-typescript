(ns dots.typescript.extended-config-cache-entry)

(defn extended-result
  ^js [extended-config-cache-entry]
  (.-extendedResult ^js extended-config-cache-entry))

(defn set-extended-result!
  ^js [extended-config-cache-entry value]
  (set! (.-extendedResult ^js extended-config-cache-entry) value))

(defn extended-config
  ^js [extended-config-cache-entry]
  (.-extendedConfig ^js extended-config-cache-entry))

(defn set-extended-config!
  ^js [extended-config-cache-entry value]
  (set! (.-extendedConfig ^js extended-config-cache-entry) value))
