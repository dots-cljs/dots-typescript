(ns dots.typescript.build-options)

(defn dry?
  ^js [build-options]
  (.-dry ^js build-options))

(defn set-dry!
  ^js [build-options value]
  (set! (.-dry ^js build-options) value))

(defn force?
  ^js [build-options]
  (.-force ^js build-options))

(defn set-force!
  ^js [build-options value]
  (set! (.-force ^js build-options) value))

(defn verbose?
  ^js [build-options]
  (.-verbose ^js build-options))

(defn set-verbose!
  ^js [build-options value]
  (set! (.-verbose ^js build-options) value))

(defn incremental?
  ^js [build-options]
  (.-incremental ^js build-options))

(defn set-incremental!
  ^js [build-options value]
  (set! (.-incremental ^js build-options) value))

(defn assume-changes-only-affect-direct-dependencies?
  ^js [build-options]
  (.-assumeChangesOnlyAffectDirectDependencies ^js build-options))

(defn set-assume-changes-only-affect-direct-dependencies!
  ^js [build-options value]
  (set! (.-assumeChangesOnlyAffectDirectDependencies ^js build-options) value))

(defn trace-resolution?
  ^js [build-options]
  (.-traceResolution ^js build-options))

(defn set-trace-resolution!
  ^js [build-options value]
  (set! (.-traceResolution ^js build-options) value))
