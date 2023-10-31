(ns dots.typescript.source-map-span)

(defn emitted-line
  "Line number in the .js file."
  ^js [source-map-span]
  (.-emittedLine ^js source-map-span))

(defn set-emitted-line!
  "Line number in the .js file."
  ^js [source-map-span value]
  (set! (.-emittedLine ^js source-map-span) value))

(defn emitted-column
  "Column number in the .js file."
  ^js [source-map-span]
  (.-emittedColumn ^js source-map-span))

(defn set-emitted-column!
  "Column number in the .js file."
  ^js [source-map-span value]
  (set! (.-emittedColumn ^js source-map-span) value))

(defn source-line
  "Line number in the .ts file."
  ^js [source-map-span]
  (.-sourceLine ^js source-map-span))

(defn set-source-line!
  "Line number in the .ts file."
  ^js [source-map-span value]
  (set! (.-sourceLine ^js source-map-span) value))

(defn source-column
  "Column number in the .ts file."
  ^js [source-map-span]
  (.-sourceColumn ^js source-map-span))

(defn set-source-column!
  "Column number in the .ts file."
  ^js [source-map-span value]
  (set! (.-sourceColumn ^js source-map-span) value))

(defn name-index
  "Optional name (index into names array) associated with this span."
  ^js [source-map-span]
  (.-nameIndex ^js source-map-span))

(defn set-name-index!
  "Optional name (index into names array) associated with this span."
  ^js [source-map-span value]
  (set! (.-nameIndex ^js source-map-span) value))

(defn source-index
  ".ts file (index into sources array) associated with this span"
  ^js [source-map-span]
  (.-sourceIndex ^js source-map-span))

(defn set-source-index!
  ".ts file (index into sources array) associated with this span"
  ^js [source-map-span value]
  (set! (.-sourceIndex ^js source-map-span) value))
