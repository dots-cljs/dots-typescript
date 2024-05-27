(ns dots.typescript.build-options)

(defn dry?
  "**Returns:** `boolean | undefined`"
  ^js [build-options]
  (.-dry ^js build-options))

(defn set-dry!
  ^js [build-options value]
  (set! (.-dry ^js build-options) value))

(defn force?
  "**Returns:** `boolean | undefined`"
  ^js [build-options]
  (.-force ^js build-options))

(defn set-force!
  ^js [build-options value]
  (set! (.-force ^js build-options) value))

(defn verbose?
  "**Returns:** `boolean | undefined`"
  ^js [build-options]
  (.-verbose ^js build-options))

(defn set-verbose!
  ^js [build-options value]
  (set! (.-verbose ^js build-options) value))

(defn incremental?
  "**Returns:** `boolean | undefined`"
  ^js [build-options]
  (.-incremental ^js build-options))

(defn set-incremental!
  ^js [build-options value]
  (set! (.-incremental ^js build-options) value))

(defn assume-changes-only-affect-direct-dependencies?
  "**Returns:** `boolean | undefined`"
  ^js [build-options]
  (.-assumeChangesOnlyAffectDirectDependencies ^js build-options))

(defn set-assume-changes-only-affect-direct-dependencies!
  ^js [build-options value]
  (set! (.-assumeChangesOnlyAffectDirectDependencies ^js build-options) value))

(defn declaration?
  "**Returns:** `boolean | undefined`"
  ^js [build-options]
  (.-declaration ^js build-options))

(defn set-declaration!
  ^js [build-options value]
  (set! (.-declaration ^js build-options) value))

(defn declaration-map?
  "**Returns:** `boolean | undefined`"
  ^js [build-options]
  (.-declarationMap ^js build-options))

(defn set-declaration-map!
  ^js [build-options value]
  (set! (.-declarationMap ^js build-options) value))

(defn emit-declaration-only?
  "**Returns:** `boolean | undefined`"
  ^js [build-options]
  (.-emitDeclarationOnly ^js build-options))

(defn set-emit-declaration-only!
  ^js [build-options value]
  (set! (.-emitDeclarationOnly ^js build-options) value))

(defn source-map?
  "**Returns:** `boolean | undefined`"
  ^js [build-options]
  (.-sourceMap ^js build-options))

(defn set-source-map!
  ^js [build-options value]
  (set! (.-sourceMap ^js build-options) value))

(defn inline-source-map?
  "**Returns:** `boolean | undefined`"
  ^js [build-options]
  (.-inlineSourceMap ^js build-options))

(defn set-inline-source-map!
  ^js [build-options value]
  (set! (.-inlineSourceMap ^js build-options) value))

(defn trace-resolution?
  "**Returns:** `boolean | undefined`"
  ^js [build-options]
  (.-traceResolution ^js build-options))

(defn set-trace-resolution!
  ^js [build-options value]
  (set! (.-traceResolution ^js build-options) value))
