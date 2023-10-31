(ns dots.typescript.document-span)

(defn text-span
  ^js [document-span]
  (.-textSpan ^js document-span))

(defn set-text-span!
  ^js [document-span value]
  (set! (.-textSpan ^js document-span) value))

(defn file-name
  ^js [document-span]
  (.-fileName ^js document-span))

(defn set-file-name!
  ^js [document-span value]
  (set! (.-fileName ^js document-span) value))

(defn original-text-span
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here"
  ^js [document-span]
  (.-originalTextSpan ^js document-span))

(defn set-original-text-span!
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here"
  ^js [document-span value]
  (set! (.-originalTextSpan ^js document-span) value))

(defn original-file-name
  ^js [document-span]
  (.-originalFileName ^js document-span))

(defn set-original-file-name!
  ^js [document-span value]
  (set! (.-originalFileName ^js document-span) value))

(defn context-span
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration"
  ^js [document-span]
  (.-contextSpan ^js document-span))

(defn set-context-span!
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration"
  ^js [document-span value]
  (set! (.-contextSpan ^js document-span) value))

(defn original-context-span
  ^js [document-span]
  (.-originalContextSpan ^js document-span))

(defn set-original-context-span!
  ^js [document-span value]
  (set! (.-originalContextSpan ^js document-span) value))
