(ns dots.typescript.performance-event)

(defn kind
  "**Returns:** `\"UpdateGraph\" | \"CreatePackageJsonAutoImportProvider\"`"
  ^js [performance-event]
  (.-kind ^js performance-event))

(defn set-kind!
  ^js [performance-event value]
  (set! (.-kind ^js performance-event) value))

(defn duration-ms
  "**Returns:** `number`"
  ^js [performance-event]
  (.-durationMs ^js performance-event))

(defn set-duration-ms!
  ^js [performance-event value]
  (set! (.-durationMs ^js performance-event) value))
