(ns dots.typescript.server.protocol.file-span
  "Object found in response messages defining a span of text in a specific source file.")

(defn file
  "File containing text span."
  ^js [file-span]
  (.-file ^js file-span))

(defn set-file!
  "File containing text span."
  ^js [file-span value]
  (set! (.-file ^js file-span) value))

(defn start
  "First character of the definition."
  ^js [file-span]
  (.-start ^js file-span))

(defn set-start!
  "First character of the definition."
  ^js [file-span value]
  (set! (.-start ^js file-span) value))

(defn end
  "One character past last character of the definition."
  ^js [file-span]
  (.-end ^js file-span))

(defn set-end!
  "One character past last character of the definition."
  ^js [file-span value]
  (set! (.-end ^js file-span) value))
