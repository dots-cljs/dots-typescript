(ns dots.typescript.resolved-module-with-failed-lookup-locations)

(defn resolved-module
  "**Returns:** `ResolvedModuleFull | undefined`"
  ^js [resolved-module-with-failed-lookup-locations]
  (.-resolvedModule ^js resolved-module-with-failed-lookup-locations))
