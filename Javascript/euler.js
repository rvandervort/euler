var pad, problem, problem_number;

problem_number = process.argv[2];

pad = '000';

problem_number = pad.substring(0, pad.length - problem_number.length) + problem_number;

problem = require('./' + problem_number);

problem.run();
