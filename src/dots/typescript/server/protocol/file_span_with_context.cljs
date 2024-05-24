(ns dots.typescript.server.protocol.file-span-with-context)

(defn file
  "File containing text span."
  ^js [file-span-with-context]
  (.-file ^js file-span-with-context))

(defn set-file!
  "File containing text span."
  ^js [file-span-with-context value]
  (set! (.-file ^js file-span-with-context) value))

(defn start
  "First character of the definition."
  ^js [file-span-with-context]
  (.-start ^js file-span-with-context))

(defn set-start!
  "First character of the definition."
  ^js [file-span-with-context value]
  (set! (.-start ^js file-span-with-context) value))

(defn end
  "One character past last character of the definition."
  ^js [file-span-with-context]
  (.-end ^js file-span-with-context))

(defn set-end!
  "One character past last character of the definition."
  ^js [file-span-with-context value]
  (set! (.-end ^js file-span-with-context) value))

(defn context-start
  ^js [file-span-with-context]
  (.-contextStart ^js file-span-with-context))

(defn set-context-start!
  ^js [file-span-with-context value]
  (set! (.-contextStart ^js file-span-with-context) value))

(defn context-end
  ^js [file-span-with-context]
  (.-contextEnd ^js file-span-with-context))

(defn set-context-end!
  ^js [file-span-with-context value]
  (set! (.-contextEnd ^js file-span-with-context) value))
